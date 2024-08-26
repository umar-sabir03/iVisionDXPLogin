package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalStatusHierId implements Serializable {
    @Column(name = "TABCOLUMN", nullable = false, length = 244)
    private String tabcolumn;

    @Column(name = "STATUS_FROM", nullable = false, length = 120)
    private String statusFrom;

    @Column(name = "STATUS_TO", nullable = false, length = 120)
    private String statusTo;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
