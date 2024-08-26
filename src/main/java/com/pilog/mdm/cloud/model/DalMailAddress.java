package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalMailAddressId;
import lombok.Data;

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
@Table(name = "DAL_MAIL_ADDRESS")
@Data
public class DalMailAddress implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0))})
    private DalMailAddressId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "MAIL_LOG_SEQUENCE", nullable = false, precision = 22, scale = 0)
    private String mailLogSequence;

    @Column(name = "USER_NAME", length = 200)
    private String userName;

    @Column(name = "PERS_ID")
    private String persId;

    @Column(name = "EMAIL_ADDRESS", length = 400)
    private String emailAddress;

    @Column(name = "EMAIL_ADDRESS_FLAG", length = 8)
    private String emailAddressFlag;

    @Column(name = "EMAIL_SUBJECT", length = 800)
    private String emailSubject;

    @Column(name = "SMS_TEXT", length = 4000)
    private String smsText;

    @Column(name = "STATUS", length = 80)
    private String status;

    @Column(name = "LOG_MESSAGE", length = 4000)
    private String logMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SENT_DATE", length = 7)
    private Date sentDate;

    @Column(name = "EMAIL_TEXT")
    private Clob emailText;

    @Column(name = "DELIVERY_COMMENT")
    private Clob deliveryComment;

    @Column(name = "CHECK_DELIVERY_STATUS")
    private String checkDeliveryStatus;

}
