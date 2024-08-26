package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.ORecordBuLevelId;
import lombok.Data;

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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "O_RECORD_BU_LEVEL", uniqueConstraints = {@UniqueConstraint(columnNames = {"AUDIT_ID"})})
@Data
public class ORecordBuLevel implements Serializable {
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "recordNo", column = @Column(name = "RECORD_NO", nullable = false, length = 80)), @AttributeOverride(name = "region", column = @Column(name = "REGION", nullable = false, length = 80)), @AttributeOverride(name = "locale", column = @Column(name = "LOCALE", nullable = false, length = 20)), @AttributeOverride(name = "businessUnit", column = @Column(name = "BUSINESS_UNIT", nullable = false, length = 120)), @AttributeOverride(name = "instance", column = @Column(name = "INSTANCE", nullable = false, length = 80))})
    private ORecordBuLevelId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECORD_NO", nullable = false, insertable = false, updatable = false)
    private ORecordRegister ORecordRegister;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUSINESS_UNIT", nullable = false, insertable = false, updatable = false)
    private BPlant BPlant;

    @Column(name = "STATUS", nullable = false, length = 80)
    private String status;

    @Column(name = "ERP_COMMENT", length = 1000)
    private String erpComment;

    @Column(name = "ERP_TRANSFERRED_BY", length = 200)
    private String erpTransferredBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ERP_TRANSFERRED_DATE", length = 7)
    private Date erpTransferredDate;

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

    @Column(name = "AUDIT_ID", unique = true, length = 240)
    private String auditId;

    @Column(name = "STEPS", precision = 22, scale = 0)
    private BigInteger steps;

    @Column(name = "APPROVED_BY", length = 200)
    private String approvedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "APPROVED_DATE", length = 7)
    private Date approvedDate;

    @Column(name = "SUPERCEDED_BY", length = 80)
    private String supercededBy;

    @Column(name = "DELETION_FLAG", length = 4)
    private String deletionFlag;

    @Column(name = "R_QL", length = 4)
    private String qualityLevel;

    @Column(name = "R_TL", length = 4)
    private String trustLevel;

    @Column(name = "R_ST", length = 4)
    private String activeStatus;

    @Column(name = "RECORD_STATUS", length = 80)
    private String recordStatus;

    @Column(name = "PROJECT", length = 80)
    private String project;

    @Column(name = "ENTITY", length = 200)
    private String entity;

    @Column(name = "DOC_NO", length = 400)
    private String docNo;

    @Column(name = "MODIFY_FLAG", length = 4)
    private String modifyFlag;

    @Column(name = "REQUEST_DESCR", length = 2000)
    private String requestDescr;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "DATA_SOURCE", length = 400)
    private String dataSource;

    @Column(name = "RPRT_SOURCE", length = 10)
    private String rprtSource;

    @Column(name = "TEST_CERTIFICATE", length = 10)
    private String testCertificate;

    @Column(name = "TEST_CERT_COMMENT", length = 10)
    private String testCertComment;

    @Column(name = "URGENCY_IND", length = 10)
    private String urgencyInd;

    @Column(name = "URGENCY_COMMENTS", length = 200)
    private String urgencyComments;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CUSTOM_COLUMN1_DATE", length = 50)
    private Date customColumn1Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CUSTOM_COLUMN2_DATE", length = 50)
    private Date customColumn2Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CUSTOM_COLUMN3_DATE", length = 50)
    private Date customColumn3Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CUSTOM_COLUMN4_DATE", length = 50)
    private Date customColumn4Date;

    @Column(name = "CUSTOM_COLUMN5", length = 16)
    private String customColumn5;

    @Column(name = "CUSTOM_COLUMN6", length = 16)
    private String customColumn6;

    @Column(name = "CUSTOM_COLUMN7", length = 16)
    private String customColumn7;

    @Column(name = "CUSTOM_COLUMN8", length = 16)
    private String customColumn8;

    @Column(name = "CUSTOM_COLUMN9", length = 16)
    private String customColumn9;

    @Column(name = "CUSTOM_COLUMN10", length = 16)
    private String customColumn10;

    @Column(name = "CUSTOM_COLUMN11", length = 16)
    private String customColumn11;

    @Column(name = "CUSTOM_COLUMN12", length = 16)
    private String customColumn12;

    @Column(name = "CUSTOM_COLUMN13", length = 16)
    private String customColumn13;

    @Column(name = "CUSTOM_COLUMN14", length = 16)
    private String customColumn14;

    @Column(name = "CUSTOM_COLUMN15", length = 16)
    private String customColumn15;

    @Column(name = "BU_CUST_COL16")
    private String buCustCol16;

    @Column(name = "BU_CUST_COL17")
    private String buCustCol17;

    @Column(name = "BU_CUST_COL18")
    private String buCustCol18;

    @Column(name = "BU_CUST_COL19")
    private String buCustCol19;

    @Column(name = "BU_CUST_COL20")
    private String buCustCol20;

    @Column(name = "BU_CUST_COL21")
    private String buCustCol21;

    @Column(name = "BU_CUST_COL22")
    private String buCustCol22;

    @Column(name = "BU_CUST_COL23")
    private String buCustCol23;

    @Column(name = "BU_CUST_COL24")
    private String buCustCol24;

    @Column(name = "BU_CUST_COL25")
    private String buCustCol25;

    @Column(name = "BU_CUST_COL26")
    private String buCustCol26;

    @Column(name = "BU_CUST_COL27")
    private String buCustCol27;

    @Column(name = "BU_CUST_COL28")
    private String buCustCol28;

    @Column(name = "BU_CUST_COL29")
    private String buCustCol29;

    @Column(name = "BU_CUST_COL30")
    private String buCustCol30;

    @Column(name = "BU_CUST_COL31")
    private String buCustCol31;

    @Column(name = "BU_CUST_COL32")
    private String buCustCol32;

    @Column(name = "BU_CUST_COL33")
    private String buCustCol33;

    @Column(name = "BU_CUST_COL34")
    private String buCustCol34;

    @Column(name = "BU_CUST_COL35")
    private String buCustCol35;

}
