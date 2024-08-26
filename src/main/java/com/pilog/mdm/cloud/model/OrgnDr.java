package com.pilog.mdm.cloud.model;


import com.pilog.mdm.cloud.model.id.OrgnDrId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "ORGN_DR")
@Data
public class OrgnDr implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "drId", column = @Column(name = "DR_ID", nullable = false)), @AttributeOverride(name = "classConceptId", column = @Column(name = "CLASS_CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "propertyConceptId", column = @Column(name = "PROPERTY_CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 120))})
    private OrgnDrId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "CLASS_TERM", nullable = false, length = 1000)
    private String classTerm;

    @Column(name = "DOMAIN", nullable = false, length = 400)
    private String domain;

    @Column(name = "PROPERTY_TERM", nullable = false, length = 1000)
    private String propertyTerm;

    @Column(name = "SHORT_SEQ", nullable = false, precision = 22, scale = 0)
    private BigInteger shortSeq;

    @Column(name = "LONG_SEQ", nullable = false, precision = 22, scale = 0)
    private BigInteger longSeq;

    @Column(name = "REQUIRED_FLAG", nullable = false, length = 4)
    private String requiredFlag;

    @Column(name = "PDR_FLAG", nullable = false, length = 4)
    private String pdrFlag = "N";

    @Column(name = "DATA_TYPE", nullable = false, length = 120)
    private String dataType;

    @Column(name = "DRIVEN_BY", length = 200)
    private String drivenBy;

    @Column(name = "ATTACH_ID", length = 80)
    private String attachId;

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

    @Column(name = "HIGH_LEVEL_ID")
    private String highLevelId;

    @Column(name = "STXT_FLAG", length = 4)
    private String stxtFlag = "Y";

    @Column(name = "LTXT_FLAG", length = 4)
    private String ltxtFlag = "Y";

    @Column(name = "AUDIT_ID")
    private String auditId;

    @Column(name = "COMMENTS", length = 400)
    private String comments;

}
