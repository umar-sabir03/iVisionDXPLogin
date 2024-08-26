package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalOperatorsId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private BigInteger sequenceNo;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
    private String orgnId;
}
