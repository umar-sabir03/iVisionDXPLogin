package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalSearchBasketsId implements Serializable {
    @Column(name = "SEARCH_ID", nullable = false, length = 400)
    private String searchId;

    @Column(name = "TNAM", nullable = false, length = 120)
    private String tnam;

    @Column(name = "ROLE_ID", nullable = false, length = 80)
    private String roleId;

    @Column(name = "DESCRIPTION", nullable = false, length = 400)
    private String description;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
