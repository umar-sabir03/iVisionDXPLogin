package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalDlovId;
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
@Table(name = "DAL_DLOV")
@Data
public class DalDlov implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "dlovName", column = @Column(name = "DLOV_NAME", nullable = false, length = 400)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 5, scale = 0)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalDlovId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "DISPLAY", length = 1016)
    private String display;

    @Column(name = "PROCESS_VALUE", length = 4000)
    private String processValue;

    @Column(name = "DEFAULT_FLAG", length = 4)
    private String defaultFlag;

    @Column(name = "DATA_TYPE", length = 80)
    private String dataType;

    @Column(name = "AUTO_FILTER", nullable = false, length = 4)
    private String autoFilter;
}
