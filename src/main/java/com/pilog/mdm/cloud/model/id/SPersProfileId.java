package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SPersProfileId implements Serializable {
    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "REGION", nullable = false, length = 200)
    private String region;

    @Column(name = "INSTANCE", nullable = false, length = 120)
    private String instance;

    @Column(name = "PLANT", nullable = false, length = 120)
    private String plant;

    @Column(name = "LOCALE", nullable = false, length = 20)
    private String locale;

    @Column(name = "ROLE_ID", nullable = false, length = 120)
    private String roleId;

}