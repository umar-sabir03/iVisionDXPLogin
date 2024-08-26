package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalSearchBasketsId;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DAL_SEARCH_BASKETS")
public class DalSearchBaskets implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "searchId", column = @Column(name = "SEARCH_ID", nullable = false, length = 400)), @AttributeOverride(name = "tnam", column = @Column(name = "TNAM", nullable = false, length = 120)), @AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 80)), @AttributeOverride(name = "description", column = @Column(name = "DESCRIPTION", nullable = false, length = 400)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalSearchBasketsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "SECTION3_PAGE_ID", length = 400)
    private String section3PageId;

    @Column(name = "SECTION_PAGE_ID", length = 400)
    private String sectionPageId;

    @Column(name = "IMPORT_FLAG", length = 4)
    private String importFlag;

    @Column(name = "EXPORT_FLAG", length = 4)
    private String exportFlag;

    @Column(name = "ICON", length = 400)
    private String icon;

}
