package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class OntgCodificationId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "VERSION", nullable = false, precision = 22, scale = 0)
    private BigInteger version;

    @Column(name = "CODIF_ID", nullable = false, precision = 22, scale = 0)
    private BigInteger codifId;
}
