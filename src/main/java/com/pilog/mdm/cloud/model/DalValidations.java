package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalValidationsId;
import lombok.Data;

import java.io.Serializable;
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

@Entity
@Table(name = "DAL_VALIDATIONS")
@Data
public class DalValidations implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "instance", column = @Column(name = "INSTANCE", nullable = false, length = 12)), @AttributeOverride(name = "plant", column = @Column(name = "PLANT", nullable = false, length = 120)), @AttributeOverride(name = "valColName", column = @Column(name = "VAL_COL_NAME", nullable = false, length = 160)), @AttributeOverride(name = "valValue", column = @Column(name = "VAL_VALUE", nullable = false, length = 160)), @AttributeOverride(name = "tableName", column = @Column(name = "TABLE_NAME", nullable = false, length = 200)), @AttributeOverride(name = "columnName", column = @Column(name = "COLUMN_NAME", nullable = false, length = 160))})
    private DalValidationsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "INSTANCE", referencedColumnName = "INSTANCE", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "ORGN_ID", referencedColumnName = "ORGN_ID", nullable = false, insertable = false, updatable = false)})
    private BInstance BInstance;

    @Column(name = "COLUMN_LABEL", length = 400)
    private String columnLabel;

    @Column(name = "VAL_FLAG", length = 4)
    private String valFlag;

    @Column(name = "P_TABLE_NAME", length = 200)
    private String PTableName;

    @Column(name = "P_COL_NAME", length = 160)
    private String PColName;

    @Column(name = "P_PARAM_COL", length = 200)
    private String PParamCol;

    @Column(name = "P_V_REGEX1", length = 2000)
    private String PVRegex1;

    @Column(name = "COLUMN_REGX", length = 2000)
    private String columnRegx;

    @Column(name = "P_VALUE1", length = 400)
    private String PValue1;

    @Column(name = "P_V_REGEX2", length = 2000)
    private String PVRegex2;

    @Column(name = "P_VALUE2", length = 400)
    private String PValue2;

    @Column(name = "P_V_REGEX3", length = 2000)
    private String PVRegex3;

    @Column(name = "P_VALUE3", length = 400)
    private String PValue3;

    @Column(name = "P_V_REGEX4", length = 2000)
    private String PVRegex4;

    @Column(name = "P_VALUE4", length = 400)
    private String PValue4;

    @Column(name = "P_V_REGEX5", length = 2000)
    private String PVRegex5;

    @Column(name = "P_VALUE5", length = 400)
    private String PValue5;

    @Column(name = "C_TABLE_NAME", length = 200)
    private String CTableName;

    @Column(name = "C_COL_NAME", length = 160)
    private String CColName;

    @Column(name = "C_PARAM_COL", length = 200)
    private String CParamCol;

    @Column(name = "C_V_REGEX1", length = 2000)
    private String CVRegex1;

    @Column(name = "C_VALUE1", length = 400)
    private String CValue1;

    @Column(name = "C_V_REGEX2", length = 2000)
    private String CVRegex2;

    @Column(name = "C_VALUE2", length = 400)
    private String CValue2;

    @Column(name = "C_V_REGEX3", length = 2000)
    private String CVRegex3;

    @Column(name = "C_VALUE3", length = 400)
    private String CValue3;

    @Column(name = "C_V_REGEX4", length = 2000)
    private String CVRegex4;

    @Column(name = "C_VALUE4", length = 400)
    private String CValue4;

    @Column(name = "C_V_REGEX5", length = 2000)
    private String CVRegex5;

    @Column(name = "C_VALUE5", length = 400)
    private String CValue5;
}
