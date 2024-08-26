package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SAuthHistoryId implements Serializable {
    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "SEQ", nullable = false, precision = 22, scale = 0)
    private BigInteger seq;

    @Column(name = "PASS_PHRASE", nullable = false, length = 400)
    private String passPhrase;
}
