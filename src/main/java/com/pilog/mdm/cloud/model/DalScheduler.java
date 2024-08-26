package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalSchedulerId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DAL_SCHEDULER", uniqueConstraints = {@UniqueConstraint(columnNames = {"TASK_NAME"})})
@Data
public class DalScheduler implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "taskName", column = @Column(name = "TASK_NAME", unique = true, nullable = false, length = 200)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalSchedulerId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "ACTION_CLASS_FUNCTION_ID", nullable = false, length = 1020)
    private String actionClassFunctionId;

    @Column(name = "DESCRIPTION", nullable = false, length = 2000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_DATETIME", nullable = false, length = 7)
    private Date startDatetime;

    @Column(name = "FREQUENCY", nullable = false, length = 80)
    private String frequency;

    @Column(name = "ACTIVE_FLAG", nullable = false, length = 4)
    private String activeFlag;

    @Column(name = "PLANT", length = 400)
    private String plant;

    @Column(name = "SCHEDULAR_INIT_PARAMS")
    private String schedularInitParams;

    @Column(name = "STATUS")
    private String status;
}
