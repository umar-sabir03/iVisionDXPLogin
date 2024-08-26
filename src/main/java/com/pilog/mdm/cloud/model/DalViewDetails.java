package com.pilog.mdm.cloud.model;


import com.pilog.mdm.cloud.model.id.DalViewDetailsId;
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
@Table(name = "DAL_VIEW_DETAILS")
@Data
public class DalViewDetails implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "viewId", column = @Column(name = "VIEW_ID", nullable = false, length = 400)), @AttributeOverride(name = "description", column = @Column(name = "DESCRIPTION", nullable = false, length = 1000)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "operationIcon", column = @Column(name = "OPERATION_ICON", nullable = false, length = 4000)), @AttributeOverride(name = "type", column = @Column(name = "TYPE", nullable = false, length = 80)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalViewDetailsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "VIEW_TYPE", length = 400)
    private String viewType;

    @Column(name = "TAB_ATTRIBUTE", length = 4000)
    private String tabAttribute;

    @Column(name = "NAVIGATION_PAGE", length = 800)
    private String navigationPage;

    @Column(name = "ICON", length = 800)
    private String icon;

    @Column(name = "HIGH_LEVEL_VIEW_ID", length = 400)
    private String highLevelViewId;

    @Column(name = "ADD_ICON_PATH", length = 240)
    private String addIconPath;

    @Column(name = "ADD_ICON_ID", length = 240)
    private String addIconId;

    @Column(name = "ADD_ICON_CLASS", length = 240)
    private String addIconClass;

    @Column(name = "ADD_ICON_STYLE", length = 240)
    private String addIconStyle;

    @Column(name = "ADD_ICON_DISPLAY", length = 4)
    private String addIconDisplay;

    @Column(name = "UPDATE_ICON_PATH", length = 240)
    private String updateIconPath;

    @Column(name = "UPDATE_ICON_ID", length = 240)
    private String updateIconId;

    @Column(name = "UPDATE_ICON_CLASS", length = 240)
    private String updateIconClass;

    @Column(name = "UPDATE_ICON_STYLE", length = 240)
    private String updateIconStyle;

    @Column(name = "UPDATE_ICON_DISPLAY", length = 4)
    private String updateIconDisplay;

    @Column(name = "DELETE_ICON_PATH", length = 240)
    private String deleteIconPath;

    @Column(name = "DELETE_ICON_ID", length = 240)
    private String deleteIconId;

    @Column(name = "DELETE_ICON_CLASS", length = 240)
    private String deleteIconClass;

    @Column(name = "DELETE_ICON_STYLE", length = 240)
    private String deleteIconStyle;

    @Column(name = "DELETE_ICON_DISPLAY", length = 4)
    private String deleteIconDisplay;

    @Column(name = "GRID_ICON_PATH", length = 240)
    private String gridIconPath;

    @Column(name = "GRID_ICON_ID", length = 240)
    private String gridIconId;

    @Column(name = "GRID_ICON_CLASS", length = 240)
    private String gridIconClass;

    @Column(name = "GRID_ICON_STYLE", length = 240)
    private String gridIconStyle;

    @Column(name = "GRID_ICON_DISPLAY", length = 4)
    private String gridIconDisplay;

    @Column(name = "TABLE_NAME", length = 400)
    private String tableName;

    @Column(name = "COND_COL_NAMES", length = 400)
    private String condColNames;

    @Column(name = "VIEW_NAME", length = 400)
    private String viewName;

    @Column(name = "CONDTION_FLAG", length = 4)
    private String condtionFlag;

    @Column(name = "CONDTION_TABLE_NAME", length = 400)
    private String condtionTableName;

    @Column(name = "DELETE_COND_FLAG", length = 4)
    private String deleteCondFlag;

    @Column(name = "DELETE_COND_COLN_NAMES", length = 400)
    private String deleteCondColnNames;

    @Column(name = "DELETE_TABLE_NAMES", length = 400)
    private String deleteTableNames;

    @Column(name = "SELECT_COND_COLN_NAMES", length = 400)
    private String selectCondColnNames;

    @Column(name = "STRIP_COLN_NAME", length = 400)
    private String stripColnName;

    @Column(name = "REF_STRIP_COLN_NAME", length = 400)
    private String refStripColnName;

}
