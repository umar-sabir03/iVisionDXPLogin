package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalSearchOperatorsId implements Serializable {
    @Column(name = "SEARCH_CDE", nullable = false, length = 400)
    private String searchCde;

    @Column(name = "OPERATOR_ID", nullable = false, precision = 22, scale = 0)
    private BigInteger operatorId;

    @Column(name = "LABEL", nullable = false, length = 120)
    private String label;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

}
