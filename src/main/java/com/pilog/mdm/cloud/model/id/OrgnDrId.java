package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
@Data
public class OrgnDrId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "DR_ID", nullable = false)
    private String drId;

    @Column(name = "CLASS_CONCEPT_ID", nullable = false, length = 120)
    private String classConceptId;

    @Column(name = "PROPERTY_CONCEPT_ID", nullable = false, length = 120)
    private String propertyConceptId;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;
}
