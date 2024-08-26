package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.OntgCharValuesId;

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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ONTG_CHAR_VALUES")
public class OntgCharValues implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "conceptId", column = @Column(name = "CONCEPT_ID", nullable = false, length = 120)), @AttributeOverride(name = "term", column = @Column(name = "TERM", nullable = false, length = 4000)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 120))})
    private OntgCharValuesId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "LANGUAGE_ID", referencedColumnName = "LANGUAGE_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "LANGUAGE", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false)})
    private BLanguage BLanguage;

    @Column(name = "CONCEPT_TYPE", nullable = false, length = 80)
    private String conceptType;

    @Column(name = "TERM_ID", nullable = false, length = 120)
    private String termId;

    @Column(name = "ABBREVIATION_ID", length = 120)
    private String abbreviationId;

    @Column(name = "ABBREVIATION", length = 1000)
    private String abbreviation;

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

    @Column(name = "TERM2", length = 4000)
    private String term2;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ontgCharValues")
    private Set<DrCharValues> drCharValueses = new HashSet<>(0);

    public Set<DrCharValues> getDrCharValueses() {
        return this.drCharValueses;
    }
}