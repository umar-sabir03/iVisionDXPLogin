package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.CAuditRecordId;

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
@Table(name = "C_AUDIT_RECORD")
public class CAuditRecord implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "tableName", column = @Column(name = "TABLE_NAME", nullable = false, length = 128)), @AttributeOverride(name = "columnName", column = @Column(name = "COLUMN_NAME", nullable = false, length = 200)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private CAuditRecordId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "AUDIT_FLAG", length = 4)
    private String auditFlag;
}
