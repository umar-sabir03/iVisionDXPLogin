package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class BApplPropertiesId implements Serializable {
    @Column(name = "KEYNAME", nullable = false, length = 200)
    private String keyname;

    @Column(name = "PROCESS_VALUE", nullable = false, length = 2000)
    private String processValue;

}
