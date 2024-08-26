package com.pilog.mdm.cloud.model;
import com.pilog.mdm.cloud.model.id.BSessionsId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "B_SESSIONS")
@Data
public class BSessions implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "parameter", column = @Column(name = "PARAMETER", nullable = false, length = 1000)), @AttributeOverride(name = "processValue", column = @Column(name = "PROCESS_VALUE", nullable = false, length = 1000))})
    private BSessionsId id;

    @Column(name = "DEFAULT_FLAG", length = 4)
    private String defaultFlag;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", length = 200)
    private String editBy;

    @Column(name = "SEQUENCE_NO")
    private BigInteger sequenceNo;

}
