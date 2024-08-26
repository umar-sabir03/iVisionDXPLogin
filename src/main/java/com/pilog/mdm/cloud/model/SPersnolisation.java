package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.SPersnolisationId;
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
@Table(name = "S_PERSNOLISATION")
@Data
public class SPersnolisation implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "persId", column = @Column(name = "PERS_ID", nullable = false)), @AttributeOverride(name = "type", column = @Column(name = "TYPE", nullable = false, length = 400)), @AttributeOverride(name = "fileName", column = @Column(name = "FILE_NAME", nullable = false, length = 1000))})
    private SPersnolisationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_ID", nullable = false, insertable = false, updatable = false)
    private SPersDetail SPersDetail;

    @Column(name = "CONTENT")
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
