package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class DrCharValuesId implements Serializable {
    @Column(name = "CLASS_CONCEPT_ID", nullable = false, length = 120)
    private String classConceptId;

    @Column(name = "PROPERTY_CONCEPT_ID", nullable = false, length = 120)
    private String propertyConceptId;

    @Column(name = "VALUE_CONCEPT_ID", nullable = false, length = 120)
    private String valueConceptId;

    @Column(name = "TERM", nullable = false, length = 4000)
    private String term;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;

}
