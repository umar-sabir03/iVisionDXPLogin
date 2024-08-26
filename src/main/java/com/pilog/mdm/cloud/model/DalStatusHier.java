package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalStatusHierId;
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
@Table(name = "DAL_STATUS_HIER")
@Data
public class DalStatusHier implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "tabcolumn", column = @Column(name = "TABCOLUMN", nullable = false, length = 244)), @AttributeOverride(name = "statusFrom", column = @Column(name = "STATUS_FROM", nullable = false, length = 120)), @AttributeOverride(name = "statusTo", column = @Column(name = "STATUS_TO", nullable = false, length = 120)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalStatusHierId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "SEQUENCE_NO", nullable = false, precision = 126, scale = 0)
    private double sequenceNo;

    @Column(name = "DESCRIPTION", length = 400)
    private String description;

    @Column(name = "STATUS_ROWID", nullable = false, precision = 10, scale = 0)
    private long statusRowid;

    @Column(name = "PROCESS_ID", length = 200)
    private String processId;

    @Column(name = "END_OF_PROCESS", length = 4)
    private String endOfProcess;

    @Column(name = "FLOW_FLAG", length = 80)
    private String flowFlag;

    @Column(name = "DUPLICATE_CHECK_FLAG", length = 4)
    private String duplicateCheckFlag;

    @Column(name = "DOMAIN", length = 80)
    private String domain;

}
