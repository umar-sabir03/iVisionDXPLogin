package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.DalSearchOperatorsId;

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
@Table(name = "DAL_SEARCH_OPERATORS")
public class DalSearchOperators implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "searchCde", column = @Column(name = "SEARCH_CDE", nullable = false, length = 400)), @AttributeOverride(name = "operatorId", column = @Column(name = "OPERATOR_ID", nullable = false, precision = 22, scale = 0)), @AttributeOverride(name = "label", column = @Column(name = "LABEL", nullable = false, length = 120)), @AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false))})
    private DalSearchOperatorsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false, insertable = false, updatable = false)
    private OrgnStructure orgnStructure;

    @Column(name = "CSS_ID", length = 200)
    private String cssId;

    @Column(name = "CSS_REF_ROW_ID", length = 160)
    private String cssRefRowId;

    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;
}
