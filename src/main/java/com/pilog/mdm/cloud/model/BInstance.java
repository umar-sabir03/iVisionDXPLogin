package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.BInstanceId;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "B_INSTANCE")
@Data
public class BInstance implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "instance", column = @Column(name = "INSTANCE", nullable = false, length = 3)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private BInstanceId id;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BInstance")
    private Set<BPlant> BPlants = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BInstance")
    private Set<DalValidations> dalValidationses = new HashSet<>(0);

}
