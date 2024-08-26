package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class OrgnPlantProjEntityId implements Serializable {
    @Column(name = "ORGN_ID")
    private String orgnId;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "PLANT", length = 120)
    private String plant;

    @Column(name = "PROJECT", length = 200)
    private String project;

    @Column(name = "ENTITY", length = 200)
    private String entity;

    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", nullable = false, length = 200)
    private String createBy;

    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", nullable = false, length = 200)
    private String editBy;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 72)
    private String languageId;

    @Column(name = "AUDIT_ID", length = 240)
    private String auditId;

}
