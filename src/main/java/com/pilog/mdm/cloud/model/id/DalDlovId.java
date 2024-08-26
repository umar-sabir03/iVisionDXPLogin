package com.pilog.mdm.cloud.model.id;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalDlovId implements Serializable {
    @Column(name = "DLOV_NAME", nullable = false, length = 400)
    private String dlovName;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 5, scale = 0)
    private int sequenceNo;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
