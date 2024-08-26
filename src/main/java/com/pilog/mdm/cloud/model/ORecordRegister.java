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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "O_RECORD_REGISTER", uniqueConstraints = {@UniqueConstraint(columnNames = {"AUDIT_ID"})})
@Data
public class ORecordRegister implements Serializable {
    @Id
    @Column(name = "RECORD_NO", unique = true, nullable = false, length = 80)
    private String recordNo;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "DOMAIN", nullable = false, length = 120)
    private String domain;

    @Column(name = "ERP", nullable = false, length = 80)
    private String erp;

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

    @Column(name = "AUDIT_ID", unique = true, length = 240)
    private String auditId;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTER_COLUMN1_DATE", length = 7)
    private Date registerColumn1Date;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTER_COLUMN2_DATE", length = 7)
    private Date registerColumn2Date;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTER_COLUMN3_DATE", length = 7)
    private Date registerColumn3Date;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTER_COLUMN4_DATE", length = 7)
    private Date registerColumn4Date;

    @Column(name = "REGISTER_COLUMN5")
    private String registerColumn5;

    @Column(name = "REGISTER_COLUMN6")
    private String registerColumn6;

    @Column(name = "REGISTER_COLUMN7")
    private String registerColumn7;

    @Column(name = "REGISTER_COLUMN8")
    private String registerColumn8;

    @Column(name = "REGISTER_COLUMN9")
    private String registerColumn9;

    @Column(name = "REGISTER_COLUMN10")
    private String registerColumn10;

    @Column(name = "REGISTER_COLUMN11")
    private String registerColumn11;

    @Column(name = "REGISTER_COLUMN12")
    private String registerColumn12;

    @Column(name = "REGISTER_COLUMN13")
    private String registerColumn13;

    @Column(name = "REGISTER_COLUMN14")
    private String registerColumn14;

    @Column(name = "REGISTER_COLUMN15")
    private String registerColumn15;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ORecordRegister")
    private Set<ORecordText> ORecordTexts = new HashSet<>(0);

}

