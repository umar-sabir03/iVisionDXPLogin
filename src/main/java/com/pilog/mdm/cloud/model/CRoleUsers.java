package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.CRoleUsersId;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "C_ROLE_USERS")
public class CRoleUsers implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "orgnId", column = @Column(name = "ORGN_ID", nullable = false)), @AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, length = 160))})
    private CRoleUsersId id;

    @Column(name = "NO_OF_USERS")
    private BigInteger noOfUsers;

}