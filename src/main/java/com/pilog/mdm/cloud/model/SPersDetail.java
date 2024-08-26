package com.pilog.mdm.cloud.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "S_PERS_DETAIL", uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_NAME"})})
public class SPersDetail implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @Column(name = "PERS_ID", unique = true, nullable = false)
    private String persId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY", nullable = false)
    private BCountry BCountry;

    @Column(name = "USER_NAME", unique = true, length = 200)
    private String userName;

    @Column(name = "FIRST_NAME", length = 200)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 200)
    private String middleName;

    @Column(name = "LAST_NAME", length = 200)
    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DOB", length = 7)
    private Date dob;

    @Column(name = "EMAIL", nullable = false, length = 300)
    private String email;

    @Column(name = "MOBILE", nullable = false, length = 128)
    private String mobile;

    @Column(name = "TELEPHONE", length = 128)
    private String telephone;

    @Column(name = "ADDRESS_1", length = 1000)
    private String address1;

    @Column(name = "ADDRESS_2", length = 1000)
    private String address2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", nullable = false, length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", nullable = false, length = 200)
    private String editBy;

    @Column(name = "NICK_NAME", length = 200)
    private String nickName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRY_DATE", length = 7)
    private Date expiryDate;

    @Column(name = "IP_ADDRESS", length = 60)
    private String ipAddress;

    @Column(name = "EXP_SUMMARY")
    private String expSummary;

    @Column(name = "PURPOSE_REG")
    private String purposeReg;

    @Column(name = "BACKGROUND_IMG", length = 800)
    private String backgroundImg;

    @Column(name = "USER_AUTH", length = 8000)
    private String userAuth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SAuthorisation> SAuthorisations = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SPersProfile> SPersProfiles = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SPersOrgnLang> SPersOrgnLangs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SPersAudit> SPersAudits = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SPersnolisation> SPersnolisations = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private Set<SAuthHistory> SAuthHistories = new HashSet<>(0);

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "SPersDetail")
    private SPersonnel SPersonnel;


}