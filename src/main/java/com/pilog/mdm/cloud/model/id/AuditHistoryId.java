package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class AuditHistoryId implements Serializable {
    @Column(name = "AUDIT_ID", nullable = false, length = 240)
    private String auditId;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "PLANT", nullable = false, length = 120)
    private String plant;

    @Column(name = "AUDIT_SEQ", nullable = false, updatable = false, insertable = true)
    private String auditSeq;

    @Column(name = "DML_TYPE", nullable = false, length = 40)
    private String dmlType;

    @Column(name = "TABLE_NAME", nullable = false, length = 128)
    private String tableName;

    @Column(name = "COLUMN_NAME", nullable = false, length = 200)
    private String columnName;

}
