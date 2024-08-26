package com.pilog.mdm.cloud.model.id;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DalSchedulerId implements Serializable {
    @Column(name = "TASK_NAME", unique = true, nullable = false, length = 200)
    private String taskName;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;
}
