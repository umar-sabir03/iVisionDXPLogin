package com.pilog.mdm.cloud.model;


import com.pilog.mdm.cloud.model.id.BDocTypeId;
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

@Entity
@Table(name = "B_DOC_TYPE")
@Data
public class BDocType implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "docType", column = @Column(name = "DOC_TYPE", nullable = false, length = 80)), @AttributeOverride(name = "languageId", column = @Column(name = "LANGUAGE_ID", nullable = false, length = 200)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private BDocTypeId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "TYPE_DESCR", length = 1020)
    private String typeDescr;

    @Column(name = "RANGE_KEY", length = 40)
    private String rangeKey;

    @Column(name = "ACTIVE_IND", nullable = false, length = 4)
    private String activeInd;

    @Column(name = "AUDIT_ID", length = 240)
    private String auditId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "CREATE_BY", nullable = false, length = 200)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "EDIT_BY", nullable = false, length = 200)
    private String editBy;
}
