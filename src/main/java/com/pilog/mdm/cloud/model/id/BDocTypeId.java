package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class BDocTypeId implements Serializable {
    @Column(name = "DOC_TYPE", nullable = false, length = 80)
    private String docType;

    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 200)
    private String languageId;

}
