package com.pilog.mdm.cloud.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ORGN_STRUCTURE", uniqueConstraints = {@UniqueConstraint(columnNames = {"NAME"})})
public class OrgnStructure implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @Column(name = "ORGN_ID", unique = true, nullable = false)
    private String orgnId;

    @Column(name = "NAME", unique = true, nullable = false, length = 100)
    private String name;

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

    @Column(name = "ERP", length = 200)
    private String erp;

    @Column(name = "HIGH_LEVEL_ORGN_ID")
    private String highLevelOrgId;

    @Column(name = "ORGN_TYPE", length = 80)
    private String orgnType;

    @Column(name = "ACTIVE_FLAG", length = 4)
    private String activeFlag;

    @Column(name = "R_QL", length = 400)
    private String RQl;

    @Column(name = "R_TL", length = 400)
    private String RTl;

    @Column(name = "R_ST", length = 4)
    private String RSt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OntgAttachments> ontgAttachmentses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OntgCodification> ontgCodifications = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<COracleMmView> COracleMmViews = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<BPlant> BPlants = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OntgClassification> ontgClassifications = new HashSet<>(0);

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private SPersConcurr SPersConcurr;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OntgDefnitionsGuid> ontgDefnitionsGuids = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OntgTermSynonym> ontgTermSynonyms = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<SPersonnel> SPersonnels = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OrgnDr> orgnDrs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<SAuthConfiguration> SAuthConfigurations = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<SPersOrgnLang> SPersOrgnLangs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalMailAddress> dalMailAddresses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalNumberGeneration> dalNumberGenerations = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalMailLog> dalMailLogs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalRecordStatus> dalRecordStatuses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalOperators> dalOperatorses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalComponent> dalComponents = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalFormRoleStatusHier> dalFormRoleStatusHiers = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalJqxgrid> dalJqxgrids = new HashSet<>(0);



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalViewDetails> dalViewDetailses = new HashSet<>(0);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalDlov> dalDlovs = new HashSet<>(0);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalStatusHier> dalStatusHiers = new HashSet<>(0);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalSearchOperators> dalSearchOperatorses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalSearchDisplay> dalSearchDisplays = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalSearchBaskets> dalSearchBasketses = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalScheduler> dalSchedulers = new HashSet<>(0);


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalRoleView> dalRoleViews = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<DalSearchBasket> dalSearchBaskets = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<BDocType> bDocTypes = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<BEntity> BEntities = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<BProject> BProjects = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<OrgnPlantProjEntity> orgnPlantProjEntities = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<AuditHistory> auditHistories = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<CAuditRecord> CAuditRecords = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgnStructure")
    private Set<BInstance> BInstances = new HashSet<>(0);

}
