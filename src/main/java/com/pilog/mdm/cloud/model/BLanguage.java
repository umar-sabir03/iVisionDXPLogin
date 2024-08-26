package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.BLanguageId;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "B_LANGUAGE", uniqueConstraints = {@UniqueConstraint(columnNames = {"LANGUAGE_ID"})})
public class BLanguage implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", unique = true, nullable = false, length = 120)), @AttributeOverride(name = "name", column = @Column(name = "NAME", nullable = false, length = 200))})
    private BLanguageId id;

    @Column(name = "COUNTRY_CODE", length = 8)
    private String countryCode;

    @Column(name = "LANGUAGE_CODE", length = 8)
    private String languageCode;

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

    @Column(name = "ACTIVE_FLAG", length = 4)
    private String activeFlag;



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BLanguage")
    private Set<DrCharValues> drCharValueses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BLanguage")
    private Set<OntgCharValues> ontgCharValueses = new HashSet<>(0);


}
