package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalSearchDisplayId implements Serializable {
    @Column(name = "SEARCH_ID", nullable = false, length = 400)
    private String searchId;

    @Column(name = "CNAM", nullable = false, length = 120)
    private String cnam;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 5, scale = 0)
    private int sequenceNo;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
