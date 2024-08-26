package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class CAuditRecordId implements Serializable {
    @Column(name = "TABLE_NAME", nullable = false, length = 128)
    private String tableName;

    @Column(name = "COLUMN_NAME", nullable = false, length = 200)
    private String columnName;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
