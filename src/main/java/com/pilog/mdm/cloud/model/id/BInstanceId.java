package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class BInstanceId implements Serializable {
    @Column(name = "INSTANCE", nullable = false, length = 3)
    private String instance;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

}
