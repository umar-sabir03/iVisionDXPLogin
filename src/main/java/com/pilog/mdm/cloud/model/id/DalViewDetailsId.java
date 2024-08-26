package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalViewDetailsId implements Serializable {
    @Column(name = "VIEW_ID", nullable = false, length = 400)
    private String viewId;

    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
    private BigInteger sequenceNo;

    @Column(name = "OPERATION_ICON", nullable = false, length = 4000)
    private String operationIcon;

    @Column(name = "TYPE", nullable = false, length = 80)
    private String type;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
