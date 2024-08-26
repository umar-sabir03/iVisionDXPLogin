package com.pilog.mdm.cloud.model;


import com.pilog.mdm.cloud.model.id.SPersProfileId;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "S_PERS_PROFILE")
public class SPersProfile implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "persId", column = @Column(name = "PERS_ID", nullable = false)), @AttributeOverride(name = "region", column = @Column(name = "REGION", nullable = false, length = 200)), @AttributeOverride(name = "instance", column = @Column(name = "INSTANCE", nullable = false, length = 120)), @AttributeOverride(name = "plant", column = @Column(name = "PLANT", nullable = false, length = 120)), @AttributeOverride(name = "locale", column = @Column(name = "LOCALE", nullable = false, length = 20)), @AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 120))})
    private SPersProfileId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_ID", nullable = false, insertable = false, updatable = false)
    private SPersDetail SPersDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLANT", nullable = false, insertable = false, updatable = false)
    private BPlant BPlant;

    @Column(name = "REPORT_TO", length = 200)
    private String reportTo;

    @Column(name = "DEFAULT_IND", nullable = false, length = 4)
    private String defaultInd;

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

    @Column(name = "PROJECT", length = 200)
    private String project;

    @Column(name = "ENTITY", length = 200)
    private String entity;

    @Column(name = "ACOOUNT_GROUP", length = 200)
    private String acoountGroup;

    @Column(name = "COMPANY_CDE", length = 200)
    private String companyCde;

    @Column(name = "PURCHASE_GROUP", length = 200)
    private String purchaseGroup;

    @Column(name = "DOMAIN", length = 200)
    private String domain;

}

