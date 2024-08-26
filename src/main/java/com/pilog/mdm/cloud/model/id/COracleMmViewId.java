package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class COracleMmViewId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "MATL_TYPE", nullable = false, length = 200)
    private String matlType;

    @Column(name = "VIEW_CODE", nullable = false, length = 160)
    private String viewCode;

    @Column(name = "FIELD_NAME", nullable = false, length = 128)
    private String fieldName;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
    private BigInteger sequenceNo;
}
