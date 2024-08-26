package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalSearchDisplayId;
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
@Table(name = "DAL_SEARCH_DISPLAY")
@Data
public class DalSearchDisplay implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "searchId", column = @Column(name = "SEARCH_ID", nullable = false, length = 400)), @AttributeOverride(name = "cnam", column = @Column(name = "CNAM", nullable = false, length = 120)), @AttributeOverride(name = "sequenceNo", column = @Column(name = "SEQUENCE_NO", nullable = false, precision = 5, scale = 0)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalSearchDisplayId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "LABEL", length = 200)
    private String label;

    @Column(name = "DISPLAY_IND", length = 8)
    private String displayInd;

    @Column(name = "HREF", length = 600)
    private String href;

    @Column(name = "DISPLAY_SIZE", length = 16)
    private String displaySize;

    @Column(name = "SORT_SEQUENCE", precision = 5, scale = 0)
    private Integer sortSequence;

    @Column(name = "SORT_TYPE", length = 4)
    private String sortType;

    @Column(name = "PRIM", length = 4)
    private String prim;

    @Column(name = "SEARCH_IND", length = 8)
    private String searchInd;

    @Column(name = "FREEZE_IND", length = 8)
    private String freezeInd;

    @Column(name = "CSS_ID", length = 200)
    private String cssId;

    @Column(name = "CSS_ROW_ID", length = 160)
    private String cssRowId;

    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;
}
