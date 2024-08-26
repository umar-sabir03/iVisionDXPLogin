package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalNumberGenerationId;
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
@Table(name = "DAL_NUMBER_GENERATION")
@Data
public class DalNumberGeneration implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "strtUniqueSeq", column = @Column(name = "STRT_UNIQUE_SEQ", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "type", column = @Column(name = "TYPE", nullable = false, length = 800)), @AttributeOverride(name = "columnName", column = @Column(name = "COLUMN_NAME", nullable = false, length = 40))})
    private DalNumberGenerationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "SEQ_SIZE", nullable = false, precision = 22, scale = 0)
    private BigInteger seqSize;

    @Column(name = "DESCRIPTION", nullable = false, length = 200)
    private String description;

    @Column(name = "END_UNIQUE_SEQ", precision = 22, scale = 0)
    private BigInteger endUniqueSeq;

    @Column(name = "REGEXPR", length = 2000)
    private String regexpr;

    @Column(name = "SEQ_TXT", nullable = false, length = 40)
    private String seqTxt;

}
