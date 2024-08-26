package com.pilog.mdm.cloud.model.id;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SAuthConfigurationId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "PARAMETER", nullable = false, length = 1000)
    private String parameter;
}
