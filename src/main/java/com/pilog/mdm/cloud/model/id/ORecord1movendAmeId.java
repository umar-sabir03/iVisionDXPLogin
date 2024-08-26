package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class ORecord1movendAmeId implements Serializable {
    @Column(name = "MANDT", nullable = false, length = 120)
    private String mandt;

    @Column(name = "LIFNR", nullable = false, length = 80)
    private String lifnr;

    @Column(name = "REQ_NUMBER", nullable = false, length = 240)
    private String reqNumber;

    @Column(name = "INSTANCE", nullable = false, length = 120)
    private String instance;

}
