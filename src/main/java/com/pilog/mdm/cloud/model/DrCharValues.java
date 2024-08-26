package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DrCharValuesId;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DR_CHAR_VALUES")
public class DrCharValues implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "classConceptId", column = @Column(name = "CLASS_CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "propertyConceptId", column = @Column(name = "PROPERTY_CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "valueConceptId", column = @Column(name = "VALUE_CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "term", column = @Column(name = "TERM", nullable = false, length = 4000)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 120))})
    private DrCharValuesId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "VALUE_CONCEPT_ID", referencedColumnName = "CONCEPT_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "TERM", referencedColumnName = "TERM", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "LANGUAGE_ID", referencedColumnName = "LANGUAGE_ID", nullable = false, insertable = false, updatable = false)})
    private OntgCharValues ontgCharValues;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "LANGUAGE_ID", referencedColumnName = "LANGUAGE_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "LANGUAGE", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false)})
    private BLanguage BLanguage;

    @Column(name = "ABRREVIATION_ID", length = 120)
    private String abrreviationId;

    @Column(name = "ABRREVIATION", length = 1000)
    private String abrreviation;

    @Column(name = "DATA_TYPE", nullable = false, length = 120)
    private String dataType;

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

    @Column(name = "DR_ID", nullable = false)
    private String drId;

    @Column(name = "UOM_ID", length = 120)
    private String uomId;

    @Column(name = "TERM2", length = 4000)
    private String term2;

}

