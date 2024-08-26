package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.OrgnPlantProjEntityId;
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
@Table(name = "ORGN_PLANT_PROJ_ENTITY")
@Data
public class OrgnPlantProjEntity implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID")), @AttributeOverride(name = "name", column = @Column(name = "NAME", nullable = false, length = 100)), @AttributeOverride(name = "plant", column = @Column(name = "PLANT", length = 120)), @AttributeOverride(name = "project", column = @Column(name = "PROJECT", length = 200)), @AttributeOverride(name = "entity", column = @Column(name = "ENTITY", length = 200)), @AttributeOverride(name = "createDate", column = @Column(name = "CREATE_DATE", nullable = false, length = 7)), @AttributeOverride(name = "createBy", column = @Column(name = "CREATE_BY", nullable = false, length = 200)), @AttributeOverride(name = "editDate", column = @Column(name = "EDIT_DATE", nullable = false, length = 7)), @AttributeOverride(name = "editBy", column = @Column(name = "EDIT_BY", nullable = false, length = 200)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 72)), @AttributeOverride(name = "auditId", column = @Column(name = "AUDIT_ID", length = 240))})
    private OrgnPlantProjEntityId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", insertable = false, updatable = false)
    private OrgnStructure orgnStructure;
}
