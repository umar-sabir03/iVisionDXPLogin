package com.pilog.mdm.cloud.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "S_PERSONNEL")
public class SPersonnel implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign", parameters = {@Parameter(name = "property", value = "SPersDetail")})
    @GeneratedValue(generator = "generator")
    @Column(name = "PERS_ID", unique = true, nullable = false)
    private String persId;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private SPersDetail SPersDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "STATUS", nullable = false, length = 120)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRY_DATE", nullable = false, length = 7)
    private Date expiryDate;

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

    @Column(name = "PASSWORD_FLAG", nullable = false, length = 4)
    private String passwordFlag;

    @Column(name = "LOGIN_ATTEMPTS", nullable = false, precision = 22, scale = 0)
    private BigInteger loginAttempts;
}