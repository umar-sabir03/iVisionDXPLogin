package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.COracleMmViewId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
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

@Entity
@Table(name = "C_ORACLE_MM_VIEW")
@Data
public class COracleMmView implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "matlType", column = @Column(name = "MATL_TYPE", nullable = false, length = 200)), @AttributeOverride(name = "viewCode", column = @Column(name = "VIEW_CODE", nullable = false, length = 160)), @AttributeOverride(name = "fieldName", column = @Column(name = "FIELD_NAME", nullable = false, length = 128)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 22, scale = 0))})
    private COracleMmViewId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "REQUIRED_FLAG", length = 4)
    private String requiredFlag;

    @Column(name = "LABEL_DESCRIPTION", length = 1000)
    private String labelDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", length = 200)
    private String editBy;

    @Column(name = "VIEW_DESCRIPTION", nullable = false, length = 1000)
    private String viewDescription;

    @Column(name = "BASE_TABLE", length = 128)
    private String baseTable;

    @Column(name = "FIELD_TYPE_INDICATION", length = 4)
    private String fieldTypeIndication;

    @Column(name = "FIELD_LENGTH", precision = 22, scale = 0)
    private BigInteger fieldLength;

    @Column(name = "DDW_SEQUENCE", precision = 22, scale = 0)
    private BigInteger ddwSequence;

    @Column(name = "LABEL_ABBR", length = 1000)
    private String labelAbbr;
}
