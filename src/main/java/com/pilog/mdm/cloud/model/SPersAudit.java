package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.SPersAuditId;
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
@Table(name = "S_PERS_AUDIT", uniqueConstraints = {@UniqueConstraint(columnNames = {"SESSION_ID"})})
@Data
public class SPersAudit implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "persId", column = @Column(name = "PERS_ID", nullable = false)), @AttributeOverride(name = "sessionId", column = @Column(name = "SESSION_ID", unique = true, nullable = false, length = 600))})
    private SPersAuditId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_ID", nullable = false, insertable = false, updatable = false)
    private SPersDetail SPersDetail;

    @Column(name = "IP_ADDRESS", nullable = false, length = 60)
    private String ipAddress;

    @Column(name = "BROWSER", nullable = false, length = 120)
    private String browser;

    @Column(name = "DEVICE_NAME", nullable = false, length = 200)
    private String deviceName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOGIN_DATE", nullable = false, length = 7)
    private Date loginDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOGOUT_DATE", length = 7)
    private Date logoutDate;

    @Column(name = "FLAG", nullable = false, length = 4)
    private String flag;

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
