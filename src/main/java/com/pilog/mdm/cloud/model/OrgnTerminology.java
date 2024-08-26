package com.pilog.mdm.cloud.model;


import com.pilog.mdm.cloud.model.id.OrgnTerminologyId;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORGN_TERMINOLOGY")
public class OrgnTerminology implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "conceptId", column = @Column(name = "CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 120))})
    private OrgnTerminologyId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "CONCEPT_TYPE", nullable = false, length = 80)
    private String conceptType;

    @Column(name = "TERM_ID", nullable = false, length = 120)
    private String termId;

    @Column(name = "TERM", nullable = false, length = 1000)
    private String term;

    @Column(name = "DEFINITION_ID", length = 120)
    private String definitionId;

    @Column(name = "ABBREVIATION_ID", length = 120)
    private String abbreviationId;

    @Column(name = "ABBREVIATION", length = 200)
    private String abbreviation;

    @Column(name = "LABEL_ID", length = 120)
    private String labelId;

    @Column(name = "LABEL", length = 400)
    private String label;

    @Column(name = "LANGUAGE", nullable = false, length = 200)
    private String language;

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

    @Column(name = "VALID_FLAG", length = 4)
    private String validFlag;

    @Column(name = "COMMENTS", length = 400)
    private String comments;

    @Column(name = "INCL_SYNONYM_FLAG", length = 4)
    private String inclSynonymFlag;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnTerminology")
    private Set<OntgTermSynonym> ontgTermSynonyms = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnTerminology")
    private Set<OntgDefnitionsGuid> ontgDefnitionsGuids = new HashSet<>(0);


}
