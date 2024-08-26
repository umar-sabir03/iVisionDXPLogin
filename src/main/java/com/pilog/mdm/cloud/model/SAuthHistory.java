package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.SAuthHistoryId;
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
@Table(name = "S_AUTH_HISTORY")
@Data
public class SAuthHistory implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "persId", column = @Column(name = "PERS_ID", nullable = false)), @AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "passPhrase", column = @Column(name = "PASS_PHRASE", nullable = false, length = 400))})
    private SAuthHistoryId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_ID", nullable = false, insertable = false, updatable = false)
    private SPersDetail SPersDetail;

    @Column(name = "ACTIVATION_MODE", nullable = false, length = 200)
    private String activationMode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTIVATION_DATE", nullable = false, length = 7)
    private Date activationDate;

    @Column(name = "ACTIVATED_BY", nullable = false, length = 200)
    private String activatedBy;

    @Column(name = "OTP", nullable = false, length = 80)
    private String otp;

    @Column(name = "REASON", length = 1000)
    private String reason;

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

}
