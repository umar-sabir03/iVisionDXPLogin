package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalValidationsId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "INSTANCE", nullable = false, length = 12)
    private String instance;

    @Column(name = "PLANT", nullable = false, length = 120)
    private String plant;

    @Column(name = "VAL_COL_NAME", nullable = false, length = 160)
    private String valColName;

    @Column(name = "VAL_VALUE", nullable = false, length = 160)
    private String valValue;

    @Column(name = "TABLE_NAME", nullable = false, length = 200)
    private String tableName;

    @Column(name = "COLUMN_NAME", nullable = false, length = 160)
    private String columnName;
}
