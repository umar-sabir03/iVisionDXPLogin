package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.OntgClassificationId;

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
@Table(name = "ONTG_CLASSIFICATION")
public class OntgClassification implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "conceptId", column = @Column(name = "CONCEPT_ID", nullable = false, length = 120))})
    private OntgClassificationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "TERM", nullable = false, length = 200)
    private String term;

    @Column(name = "INDUSTRY", nullable = false, length = 200)
    private String industry;

    @Column(name = "DISCIPLINE", nullable = false, length = 200)
    private String discipline;

    @Column(name = "PROVENANCE", length = 400)
    private String provenance;

    @Column(name = "UNSPSC_CODE", nullable = false, length = 32)
    private String unspscCode;

    @Column(name = "UNSPSC_DESC", nullable = false, length = 400)
    private String unspscDesc;

    @Column(name = "MATL_GROUP", length = 200)
    private String matlGroup;

    @Column(name = "MATL_CATEGORY", length = 400)
    private String matlCategory;

    @Column(name = "SPEND_CATEGORY", length = 200)
    private String spendCategory;

    @Column(name = "CUSTOM_CODE", length = 80)
    private String customCode;

    @Column(name = "ECCN", length = 80)
    private String eccn;

    @Column(name = "HTS", length = 80)
    private String hts;

    @Column(name = "PURCH_GROUP", length = 40)
    private String purchGroup;

    @Column(name = "PREF_UOM1", length = 120)
    private String prefUom1;

    @Column(name = "PREF_UOM2", length = 20)
    private String prefUom2;

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

    @Column(name = "DOMAIN", nullable = false)
    private String domain;
}
