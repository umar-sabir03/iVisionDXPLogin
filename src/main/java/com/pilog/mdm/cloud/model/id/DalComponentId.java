package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalComponentId implements Serializable {
    @Column(name = "COMP_ID", nullable = false, length = 200)
    private String compId;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

}
