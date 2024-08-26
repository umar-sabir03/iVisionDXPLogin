package com.pilog.mdm.cloud.model;
import com.pilog.mdm.cloud.model.id.OntgCodificationId;

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
@Table(name = "ONTG_CODIFICATION")
public class OntgCodification implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "codifId", column = @Column(name = "CODIF_ID", nullable = false, precision = 22, scale = 0))})
    private OntgCodificationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "CODIF_DESCR", nullable = false, length = 1000)
    private String codifDescr;

    @Column(name = "HL_ID", precision = 22, scale = 0)
    private BigInteger hlId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", nullable = false, length = 200)
    private String editBy;
}
