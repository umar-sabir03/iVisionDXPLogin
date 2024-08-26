package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalRoleViewId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DAL_ROLE_VIEW")
@Data
public class DalRoleView implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 120)), @AttributeOverride(name = "viewId", column = @Column(name = "VIEW_ID", nullable = false, length = 400)), @AttributeOverride(name = "columnLabel", column = @Column(name = "COLUMN_LABEL", nullable = false, length = 400)), @AttributeOverride(name = "moduleCode", column = @Column(name = "MODULE_CODE", nullable = false, length = 200))})
    private DalRoleViewId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID")
    private OrgnStructure orgnStructure;

    @Column(name = "COLUMN_NAME", length = 400)
    private String columnName;

    @Column(name = "COLUMN_LENGTH", precision = 22, scale = 0)
    private BigInteger columnLength;

    @Column(name = "DATA_TYPE", length = 160)
    private String dataType;

    @Column(name = "EDITABLE_FLAG", length = 4)
    private String editableFlag;

    @Column(name = "DISPLAY_FLAG", length = 400)
    private String displayFlag;

    @Column(name = "COLOR_CODE", length = 400)
    private String colorCode;

    @Column(name = "DROPDOWN", length = 8)
    private String dropdown;

    @Column(name = "MANDATORY_FLAG", length = 4)
    private String mandatoryFlag;

    @Column(name = "REGEX", length = 400)
    private String regex;

    @Column(name = "DEPENDENCY", length = 400)
    private String dependency;

    @Column(name = "INPUT_ATTRIBUTE", length = 4000)
    private String inputAttribute;

    @Column(name = "TOOLTIP", length = 4000)
    private String tooltip;

    @Column(name = "LABEL_MAND", length = 4000)
    private String labelMand;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
    private BigInteger sequenceNo;

    @Column(name = "OBJECT_ID", length = 200)
    private String objectId;

    @Column(name = "CSS_ID", length = 200)
    private String cssId;

    @Column(name = "CSS_CLASS", length = 200)
    private String cssClass;

    @Column(name = "HIIDDEN_IDS", length = 200)
    private String hiiddenIds;

    @Column(name = "HIDDEN_COUNT", precision = 22, scale = 0)
    private BigInteger hiddenCount;

    @Column(name = "DD_CLASS_NAME", length = 200)
    private String ddClassName;

    @Column(name = "DD_ID", length = 200)
    private String ddId;

    @Column(name = "DD_FUNCTION_NAME", length = 200)
    private String ddFunctionName;

    @Column(name = "DD_SEQUENCE", precision = 22, scale = 0)
    private BigInteger ddSequence;

    @Column(name = "DD_PARAM3", length = 200)
    private String ddParam3;

    @Column(name = "ONKEYPRESS_FUNT_NAME", length = 240)
    private String onkeypressFuntName;

    @Column(name = "ONBLUR_FUNT_NAME", length = 240)
    private String onblurFuntName;

    @Column(name = "DD_ICON_PATH", length = 400)
    private String ddIconPath;

    @Column(name = "TEXT_MAXLENGTH", length = 20)
    private String textMaxlength;

    @Column(name = "PLACE_HOLDER", length = 400)
    private String placeHolder;

    @Column(name = "IMG_STYLE_ATTR", length = 400)
    private String imgStyleAttr;

    @Column(name = "INPUT_STYLE_ATTR", length = 400)
    private String inputStyleAttr;

    @Column(name = "ONCHANGE_FUNT_NAME", length = 400)
    private String onchangeFuntName;

    @Column(name = "INPUT_VALUE_ATTR", length = 400)
    private String inputValueAttr;

    @Column(name = "HIDDEN_INPUT_VALUE", length = 400)
    private String hiddenInputValue;

    @Column(name = "MASK_FORMAT", length = 200)
    private String maskFormat;

    @Column(name = "ONCHANGE_PARAM_CNT", precision = 22, scale = 0)
    private BigInteger onchangeParamCnt;

    @Column(name = "ONCHANGE_PARAMS", length = 400)
    private String onchangeParams;

    @Column(name = "PROGRESS_CNT_FUNC", length = 400)
    private String progressCntFunc;

    @Column(name = "TAG_ATTRIBUTE_TYP", length = 4000)
    private String tagAttributeTyp;

    @Column(name = "SPLIT_COUNT", precision = 22, scale = 0)
    private BigInteger splitCount;

    @Column(name = "SPLIT_ID", length = 400)
    private String splitId;

    @Column(name = "ATTR_SIZE", length = 400)
    private String attrSize;

    @Column(name = "ATTR_VALUE", length = 400)
    private String attrValue;

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

    @Column(name = "SPLIT_COLN_DISABLE", length = 400)
    private String splitColnDisable;

    @Column(name = "MTXT_DEPENDENCY", length = 8)
    private String mtxtDependency;

    @Column(name = "MTXT_REQUIRED", length = 8)
    private String mtxtRequired;

    @Column(name = "MTXT_APPLICABLE", length = 8)
    private String mtxtApplicable;

    @Column(name = "STRIP_COLN_NAME", length = 400)
    private String stripColnName;

    @Column(name = "REF_STRIP_COLN_NAME", length = 400)
    private String refStripColnName;
}
