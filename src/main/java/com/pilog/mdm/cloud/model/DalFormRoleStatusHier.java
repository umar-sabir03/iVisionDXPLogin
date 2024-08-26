package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalFormRoleStatusHierId;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DAL_FORM_ROLE_STATUS_HIER")
@Data
public class DalFormRoleStatusHier implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "formId", column = @Column(name = "FORM_ID", nullable = false, length = 400)), @AttributeOverride(name = "OStatusHierRowid", column = @Column(name = "O_STATUS_HIER_ROWID", nullable = false, precision = 10, scale = 0)), @AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 120)), @AttributeOverride(name = "controlFlag", column = @Column(name = "CONTROL_FLAG", nullable = false, length = 80)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalFormRoleStatusHierId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "EXPRESSIOM", length = 4000)
    private String expressiom;
}
