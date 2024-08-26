package com.pilog.mdm.cloud.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "B_COUNTRY")
@Data
public class BCountry implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @Column(name = "COUNTRY_CODE", unique = true, nullable = false, length = 8)
    private String countryCode;

    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;

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

    @Column(name = "STD_CODE", length = 40)
    private String stdCode;

    @Column(name = "LANGUAGE_ID", length = 120)
    private String languageId;

    @Column(name = "ACTIVE_IND", nullable = false, length = 4)
    private String activeInd;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BCountry")
    private Set<SPersDetail> SPersDetails = new HashSet<>(0);

}
