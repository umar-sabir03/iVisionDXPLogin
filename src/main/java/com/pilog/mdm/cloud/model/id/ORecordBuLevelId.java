package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class ORecordBuLevelId implements Serializable {
    @Column(name = "RECORD_NO", nullable = false, length = 80)
    private String recordNo;

    @Column(name = "REGION", nullable = false, length = 80)
    private String region;

    @Column(name = "LOCALE", nullable = false, length = 20)
    private String locale;

    @Column(name = "BUSINESS_UNIT", nullable = false, length = 120)
    private String businessUnit;

    @Column(name = "INSTANCE", nullable = false, length = 80)
    private String instance;
}
