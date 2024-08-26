package com.pilog.mdm.cloud.model;

import com.pilog.mdm.cloud.model.id.BApplPropertiesId;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "B_APPL_PROPERTIES")
@Data
public class BApplProperties implements Serializable {
    @Column(name = "AUDIT_ID", length = 4000)
    private String auditId;

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "keyname", column = @Column(name = "KEYNAME", nullable = false, length = 200)), @AttributeOverride(name = "processValue", column = @Column(name = "PROCESS_VALUE", nullable = false, length = 2000))})
    private BApplPropertiesId id;

    @Column(name = "HEADER", length = 200)
    private String header;

    @Column(name = "COMP_ID", length = 80)
    private String compId;


}
