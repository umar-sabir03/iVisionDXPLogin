package com.pilog.mdm.cloud.model.id;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalNumberGenerationId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "STRT_UNIQUE_SEQ", nullable = false, precision = 22, scale = 0)
    private BigInteger strtUniqueSeq;

    @Column(name = "COLUMN_NAME", length = 80)
    private String columnName;

    @Column(name = "TYPE", nullable = false, length = 100)
    private String type;
}
