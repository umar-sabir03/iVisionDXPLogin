package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class OrgnTerminologyId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "CONCEPT_ID", nullable = false, length = 120)
    private String conceptId;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;
}
