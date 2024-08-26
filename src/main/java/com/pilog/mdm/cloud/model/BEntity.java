package com.pilog.mdm.cloud.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "B_ENTITY")
@Data
public class BEntity implements Serializable {
    @Id
    @Column(name = "ENTITY", unique = true, nullable = false, length = 200)
    private String entity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "ENTITY_DESC", length = 1000)
    private String entityDesc;

    @Column(name = "ENTITY_TYPE", length = 80)
    private String entityType;

    @Column(name = "ACTIVE_IND", nullable = false, length = 4)
    private String activeInd;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 72)
    private String languageId;

    @Column(name = "AUDIT_ID", length = 240)
    private String auditId;

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

}
