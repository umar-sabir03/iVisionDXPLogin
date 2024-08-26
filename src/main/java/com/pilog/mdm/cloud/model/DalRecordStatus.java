package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalRecordStatusId;
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
@Table(name = "DAL_RECORD_STATUS")
@Data
public class DalRecordStatus implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "status", column = @Column(name = "STATUS", nullable = false, length = 120)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalRecordStatusId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "DESCRIPTION", nullable = false, length = 400)
    private String description;

    @Column(name = "TYPE", length = 200)
    private String type;

    @Column(name = "DUPLICATE_FLAG", length = 4)
    private String duplicateFlag;
}
