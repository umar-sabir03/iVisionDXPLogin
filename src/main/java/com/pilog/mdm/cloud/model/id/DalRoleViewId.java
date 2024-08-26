package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DalRoleViewId implements Serializable {
    @Column(name = "ROLE_ID", nullable = false, length = 120)
    private String roleId;

    @Column(name = "VIEW_ID", nullable = false, length = 400)
    private String viewId;

    @Column(name = "COLUMN_LABEL", nullable = false, length = 400)
    private String columnLabel;

    @Column(name = "MODULE_CODE", nullable = false, length = 200)
    private String moduleCode;

}
