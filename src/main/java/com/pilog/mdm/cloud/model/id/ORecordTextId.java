package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class ORecordTextId implements Serializable {
    @Column(name = "RECORD_NO", nullable = false, length = 80)
    private String recordNo;

    @Column(name = "LOCALE", nullable = false, length = 20)
    private String locale;

    @Column(name = "TYPE", nullable = false, length = 80)
    private String type;
}
