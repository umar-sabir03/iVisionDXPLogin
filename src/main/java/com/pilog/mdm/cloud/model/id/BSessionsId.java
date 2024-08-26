package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class BSessionsId implements Serializable {
    @Column(name = "PARAMETER", nullable = false, length = 1000)
    private String parameter;

    @Column(name = "PROCESS_VALUE", nullable = false, length = 1000)
    private String processValue;

}
