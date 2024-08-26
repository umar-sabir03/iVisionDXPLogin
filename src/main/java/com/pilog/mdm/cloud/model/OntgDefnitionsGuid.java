package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.OntgDefnitionsGuidId;
import lombok.Data;

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
@Table(name = "ONTG_DEFNITIONS_GUID")
@Data
public class OntgDefnitionsGuid implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "conceptId", column = @Column(name = "CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "conceptType", column = @Column(name = "CONCEPT_TYPE", nullable = false, length = 80)), @AttributeOverride(name = "termId", column = @Column(name = "TERM_ID", nullable = false, length = 120)), @AttributeOverride(name = "definitionId", column = @Column(name = "DEFINITION_ID", nullable = false, length = 120)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 120))})
    private OntgDefnitionsGuidId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "ORGN_ID", referencedColumnName = "ORGN_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "CONCEPT_ID", referencedColumnName = "CONCEPT_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "LANGUAGE_ID", referencedColumnName = "LANGUAGE_ID", nullable = false, insertable = false, updatable = false)})
    private OrgnTerminology orgnTerminology;

    @Column(name = "DEFINITION", length = 4000)
    private String definition;

    @Column(name = "GUIDELINE", length = 4000)
    private String guideline;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", length = 200)
    private String editBy;
}
