package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SPersAuditId implements Serializable {
    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "SESSION_ID", unique = true, nullable = false, length = 600)
    private String sessionId;
}
