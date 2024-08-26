package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.ORecord1movendId;
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
@Table(name = "O_RECORD_1MOVEND")
@Data
public class ORecord1movend implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "mandt", column = @Column(name = "MANDT", nullable = false, length = 120)), @AttributeOverride(name = "instance", column = @Column(name = "INSTANCE", nullable = false, length = 120)), @AttributeOverride(name = "lifnr", column = @Column(name = "LIFNR", nullable = false, length = 120))})
    private ORecord1movendId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIFNR", nullable = false, insertable = false, updatable = false)
    private ORecordRegister ORecordRegister;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANDT", nullable = false, insertable = false, updatable = false)
    private BPlant BPlant;

    @Column(name = "O_1IEXCD", length = 400)
    private String o1iexcd;

    @Column(name = "O_1IEXRN", length = 400)
    private String o1iexrn;

    @Column(name = "O_1IEXRG", length = 400)
    private String o1iexrg;

    @Column(name = "O_1IEXDI", length = 400)
    private String o1iexdi;

    @Column(name = "O_1IEXCO", length = 400)
    private String o1iexco;

    @Column(name = "O_1ICSTNO", length = 400)
    private String o1icstno;

    @Column(name = "O_1ILSTNO", length = 400)
    private String o1ilstno;

    @Column(name = "O_1ISERN", length = 400)
    private String o1isern;

    @Column(name = "O_1IPANNO", length = 400)
    private String o1ipanno;

    @Column(name = "O_1ISSIST", length = 400)
    private String o1issist;

    @Column(name = "EDIT_BY", nullable = false, length = 80)
    private String editBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDIT_DATE", nullable = false, length = 7)
    private Date editDate;

    @Column(name = "CREATE_BY", nullable = false, length = 80)
    private String createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 7)
    private Date createDate;

    @Column(name = "VENDOR_TYPE", length = 80)
    private String vendorType;

    @Column(name = "SEZ_APPLICABILITY", length = 4)
    private String sezApplicability;

    @Column(name = "IMPORT_EXPORT_CERT_NO", length = 80)
    private String importExportCertNo;

    @Column(name = "STAX_APPLICABILITY", length = 4)
    private String staxApplicability;

    @Column(name = "ECC_APPLICABILITY", length = 4)
    private String eccApplicability;

    @Column(name = "COMPANY_ID", length = 400)
    private String companyId;

    @Column(name = "AADHAR_CARD", length = 80)
    private String aadharCard;

    @Column(name = "AUDIT_ID", length = 240)
    private String auditId;

    @Column(name = "GST_NUMBER", length = 80)
    private String gstNumber;

    @Column(name = "HSN_CDE", length = 16000)
    private String hsnCde;

    @Column(name = "VEN_CLASS", length = 4)
    private String venClass;

    @Column(name = "PF_NO", length = 120)
    private String pfNo;

    @Column(name = "EOU_NO", length = 120)
    private String eouNo;

    @Column(name = "J_1IEXCIVE", length = 50)
    private String j1Iexcive;

    @Column(name = "J_1IVTYP", length = 50)
    private String j1Ivtyp;

    @Column(name = "J_1IVENCRE", length = 50)
    private String j1Ivencre;

    @Column(name = "J_1IPANREF", length = 50)
    private String j1Ipanref;

    @Column(name = "J_1IPANVALDT", length = 50)
    private String j1Ipanvaldt;

    @Column(name = "J_1I_CUSTOMS", length = 50)
    private String j1ICustoms;

    @Column(name = "J_1IDEDREF", length = 50)
    private String j1Idedref;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MOVEND_COLUMN1_DATE", length = 50)
    private Date movendColumn1Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MOVEND_COLUMN2_DATE", length = 50)
    private Date movendColumn2Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MOVEND_COLUMN3_DATE", length = 50)
    private Date movendColumn3Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MOVEND_COLUMN4_DATE", length = 50)
    private Date movendColumn4Date;

    @Column(name = "MOVEND_COLUMN5", length = 50)
    private String movendColumn5;

    @Column(name = "MOVEND_COLUMN6", length = 50)
    private String movendColumn6;

    @Column(name = "MOVEND_COLUMN7", length = 50)
    private String movendColumn7;

    @Column(name = "MOVEND_COLUMN8", length = 50)
    private String movendColumn8;

    @Column(name = "MOVEND_COLUMN9", length = 50)
    private String movendColumn9;

    @Column(name = "MOVEND_COLUMN10", length = 50)
    private String movendColumn10;

    @Column(name = "MOVEND_COLUMN11", length = 50)
    private String movendColumn11;

    @Column(name = "MOVEND_COLUMN12", length = 50)
    private String movendColumn12;

    @Column(name = "MOVEND_COLUMN13", length = 50)
    private String movendColumn13;

    @Column(name = "MOVEND_COLUMN14", length = 50)
    private String movendColumn14;

    @Column(name = "MOVEND_COLUMN15", length = 50)
    private String movendColumn15;

    @Column(name = "MOVEND_COLUMN16", length = 50)
    private String movendColumn16;

    @Column(name = "MOVEND_COLUMN17", length = 50)
    private String movendColumn17;

    @Column(name = "MOVEND_COLUMN18", length = 50)
    private String movendColumn18;

    @Column(name = "MOVEND_COLUMN19", length = 50)
    private String movendColumn19;

    @Column(name = "MOVEND_COLUMN20", length = 50)
    private String movendColumn20;

    @Column(name = "MOVEND_COLUMN21", length = 50)
    private String movendColumn21;

    @Column(name = "MOVEND_COLUMN22", length = 50)
    private String movendColumn22;

    @Column(name = "MOVEND_COLUMN23", length = 50)
    private String movendColumn23;

    @Column(name = "MOVEND_COLUMN24", length = 50)
    private String movendColumn24;

    @Column(name = "MOVEND_COLUMN25", length = 50)
    private String movendColumn25;

    @Column(name = "MOVEND_COLUMN26", length = 50)
    private String movendColumn26;

    @Column(name = "MOVEND_COLUMN27", length = 50)
    private String movendColumn27;

    @Column(name = "MOVEND_COLUMN28", length = 50)
    private String movendColumn28;

    @Column(name = "MOVEND_COLUMN29", length = 50)
    private String movendColumn29;

    @Column(name = "MOVEND_COLUMN30", length = 50)
    private String movendColumn30;
}
