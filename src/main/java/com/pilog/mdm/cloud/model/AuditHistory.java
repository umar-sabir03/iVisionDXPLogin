package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.AuditHistoryId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AUDIT_HISTORY")
@Data
public class AuditHistory implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "auditId", column = @Column(name = "AUDIT_ID", nullable = false, length = 240)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "plant", column = @Column(name = "PLANT", nullable = false, length = 120)), @AttributeOverride(name = "auditSeq", column = @Column(name = "AUDIT_SEQ", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "dmlType", column = @Column(name = "DML_TYPE", nullable = false, length = 40)), @AttributeOverride(name = "tableName", column = @Column(name = "TABLE_NAME", nullable = false, length = 128)), @AttributeOverride(name = "columnName", column = @Column(name = "COLUMN_NAME", nullable = false, length = 200))})
    private AuditHistoryId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLANT", nullable = false, insertable = false, updatable = false)
    private BPlant BPlant;

    @Column(name = "OLD_VALUE", length = 4000)
    private String oldValue;

    @Column(name = "NEW_VALUE", length = 4000)
    private String newValue;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AUDIT_DATE", length = 7)
    private Date auditDate;

    @Column(name = "SESSION_ID", length = 600)
    private String sessionId;

    @Column(name = "AUDIT_BY", length = 200)
    private String auditBy;

    @Column(name = "INSTANCE", length = 120)
    private String instance;
}
