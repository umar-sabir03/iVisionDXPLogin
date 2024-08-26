package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalRecordStatusId implements Serializable {
    @Column(name = "STATUS", nullable = false, length = 120)
    private String status;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
