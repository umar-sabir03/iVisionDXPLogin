package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalJqxgridId;
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
@Table(name = "DAL_JQXGRID")
@Data
public class DalJqxgrid implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "gridId", column = @Column(name = "GRID_ID", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalJqxgridId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "GRID_NAME", length = 200)
    private String gridName;

    @Column(name = "GRID_REF_TABLE", length = 200)
    private String gridRefTable;

    @Column(name = "ADD_FLAG", length = 4)
    private String addFlag;

    @Column(name = "EDIT_FLAG", length = 4)
    private String editFlag;

    @Column(name = "DELETE_FLAG", length = 4)
    private String deleteFlag;

    @Column(name = "EXPORT_FLAG", length = 4)
    private String exportFlag;

    @Column(name = "ADD_ICON_PATH", length = 2000)
    private String addIconPath;

    @Column(name = "EDIT_ICON_PATH", length = 2000)
    private String editIconPath;

    @Column(name = "DELETE_ICON_PATH", length = 2000)
    private String deleteIconPath;

    @Column(name = "ADD_LABEL", length = 2000)
    private String addLabel;

    @Column(name = "EDIT_LABEL", length = 2000)
    private String editLabel;

    @Column(name = "DELETE_LABEL", length = 2000)
    private String deleteLabel;

    @Column(name = "IMPORT_FLAG", length = 4)
    private String importFlag;

    @Column(name = "SEARCH_ID", length = 120)
    private String searchId;

    @Column(name = "VIEW_ID", length = 200)
    private String viewId;
}
