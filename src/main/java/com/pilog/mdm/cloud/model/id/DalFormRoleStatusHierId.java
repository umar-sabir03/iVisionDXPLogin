package com.pilog.mdm.cloud.model.id;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalFormRoleStatusHierId implements Serializable {
    @Column(name = "FORM_ID", nullable = false, length = 400)
    private String formId;

    @Column(name = "O_STATUS_HIER_ROWID", nullable = false, precision = 10, scale = 0)
    private long OStatusHierRowid;

    @Column(name = "ROLE_ID", nullable = false, length = 120)
    private String roleId;

    @Column(name = "CONTROL_FLAG", nullable = false, length = 80)
    private String controlFlag;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)
    private BigInteger sequenceNo;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
