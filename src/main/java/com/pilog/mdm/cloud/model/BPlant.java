package com.pilog.mdm.cloud.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "B_PLANT")
@Data
public class BPlant implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign", parameters = {@Parameter(name = "property", value = "BPlant")})
    @GeneratedValue(generator = "generator")
    @Column(name = "PLANT", unique = true, nullable = false, length = 120)
    private String plant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGN_ID", nullable = false)
    private OrgnStructure orgnStructure;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private BPlant BPlant;

    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;

    @Column(name = "HIGH_LEVEL_PLANT", length = 120)
    private String highLevelPlant;

    @Column(name = "INSTANCE")
    private String instance;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "INSTANCE", referencedColumnName = "INSTANCE", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "ORGN_ID", referencedColumnName = "ORGN_ID", nullable = false, insertable = false, updatable = false)})
    private BInstance BInstance;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BPlant")
    private Set<ORecord1movend> ORecord1movendsForMandt = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BPlant")
    private Set<ORecord1movendAme> ORecord1movendAmes = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BPlant")
    private Set<SPersProfile> SPersProfiles = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "BPlant")
    private Set<ORecordBuLevel> ORecordBuLevels = new HashSet<>(0);
}
