package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.OntgAttachmentsId;
import lombok.Data;

import java.io.Serializable;
import java.sql.Blob;
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
@Table(name = "ONTG_ATTACHMENTS")
@Data
public class OntgAttachments implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "conceptId", column = @Column(name = "CONCEPT_ID", nullable = false, length = 120))})
    private OntgAttachmentsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "FILE_NAME", nullable = false, length = 200)
    private String fileName;

    @Column(name = "TERM", nullable = false, length = 200)
    private String term;

    @Column(name = "FILE_TYPE", nullable = false, length = 200)
    private String fileType;

    @Column(name = "CONTENT", nullable = false)
    private Blob content;

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
