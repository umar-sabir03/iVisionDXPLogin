package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalSearchBasketId implements Serializable {
    @Column(name = "SEARCH_ID", nullable = false, length = 400)
    private String searchId;

    @Column(name = "ROLE_ID", nullable = false, length = 160)
    private String roleId;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
