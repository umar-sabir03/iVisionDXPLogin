package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.ORecordTextId;
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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "O_RECORD_TEXT", uniqueConstraints = {@UniqueConstraint(columnNames = {"AUDIT_ID"})})
@Data
public class ORecordText implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "recordNo", column = @Column(name = "RECORD_NO", nullable = false, length = 80)), @AttributeOverride(name = "locale", column = @Column(name = "LOCALE", nullable = false, length = 20)), @AttributeOverride(name = "type", column = @Column(name = "TYPE", nullable = false, length = 80))})
    private ORecordTextId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECORD_NO", nullable = false, insertable = false, updatable = false)
    private ORecordRegister ORecordRegister;

    @Column(name = "REGION", nullable = false, length = 80)
    private String region;

    @Column(name = "TEXT", nullable = false, length = 4000)
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", nullable = false, length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", nullable = false, length = 200)
    private String editBy;

    @Column(name = "AUDIT_ID", unique = true, length = 4000)
    private String auditId;

    @Column(name = "BUSINESS_UNIT", nullable = false, length = 80)
    private String businessUnit;

    @Column(name = "INSTANCE", nullable = false, length = 80)
    private String instance;

}
