package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalSearchBasketId;
import lombok.Data;

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
@Table(name = "DAL_SEARCH_BASKET")
@Data
public class DalSearchBasket implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "searchId", column = @Column(name = "SEARCH_ID", nullable = false, length = 400)), @AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 160)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalSearchBasketId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "SEARCH_DESC", nullable = false, length = 400)
    private String searchDesc;

    @Column(name = "SEARCH_VIEW", length = 120)
    private String searchView;

    @Column(name = "IMPORT_FLAG", length = 4)
    private String importFlag;

    @Column(name = "GRID_ID", length = 200)
    private String gridId;

    @Column(name = "GRID_HEIGHT", length = 16)
    private String gridHeight;

    @Column(name = "GRID_ROW_HEIGHT", length = 24)
    private String gridRowHeight;

    @Column(name = "SELECTION_TYPE", length = 16)
    private String selectionType;

    @Column(name = "FILTER_FLAG", length = 4)
    private String filterFlag;

    @Column(name = "THEME", length = 200)
    private String theme;

    @Column(name = "GRID_WIDTH", length = 16)
    private String gridWidth;

    @Column(name = "SEARCH_FOLLOWUP_PARAMS", length = 4000)
    private String searchFollowupParams;

}
