package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class ORecord1movendId implements Serializable {
    @Column(name = "MANDT", nullable = false, length = 120)
    private String mandt;

    @Column(name = "INSTANCE", nullable = false, length = 120)
    private String instance;

    @Column(name = "LIFNR", nullable = false, length = 120)
    private String lifnr;
}
