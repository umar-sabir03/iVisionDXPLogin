package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalComponentId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DAL_COMPONENT")
@Data
public class DalComponent implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "compId", column = @Column(name = "COMP_ID", nullable = false, length = 200)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalComponentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "DESCRIPTION", length = 1036)
    private String description;

    @Column(name = "CLASS_NAME", length = 1000)
    private String className;

    @Column(name = "IMAGE_URL", length = 1000)
    private String imageUrl;

    @Column(name = "COMP_SEQUENCE", precision = 22, scale = 0)
    private BigInteger compSequence;
}
