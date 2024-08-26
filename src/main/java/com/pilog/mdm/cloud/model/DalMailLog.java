package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalMailLogId;

import java.io.Serializable;
import java.sql.Clob;
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
@Table(name = "DAL_MAIL_LOG")
public class DalMailLog implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0))})
    private DalMailLogId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "SOURCE", length = 200)
    private String source;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUIREMENT_DATETIME", length = 7)
    private Date requirementDatetime;

    @Column(name = "SMS_NAME", length = 120)
    private String smsName;

    @Column(name = "SMS_TXT", length = 640)
    private String smsTxt;

    @Column(name = "STATUS", nullable = false, length = 80)
    private String status;

    @Column(name = "LOG_MESSAGE", length = 4000)
    private String logMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SENT_DATE", length = 7)
    private Date sentDate;

    @Column(name = "EMAIL_TXT")
    private Clob emailTxt;

}
