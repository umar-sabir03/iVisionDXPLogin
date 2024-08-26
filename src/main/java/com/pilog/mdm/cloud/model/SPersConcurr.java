package com.pilog.mdm.cloud.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "S_PERS_CONCURR")
public class SPersConcurr implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign", parameters = {@Parameter(name = "property", value = "orgnStructure")})
    @GeneratedValue(generator = "generator")
    @Column(name = "ORGN_ID", unique = true, nullable = false)
    private String orgnId;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private OrgnStructure orgnStructure;

    @Column(name = "USERS", nullable = false, precision = 22, scale = 0)
    private BigInteger users;
}
