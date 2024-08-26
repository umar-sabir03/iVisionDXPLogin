package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class OntgCharValuesId implements Serializable {
    @Column(name = "CONCEPT_ID", nullable = false, length = 120)
    private String conceptId;

    @Column(name = "TERM", nullable = false, length = 4000)
    private String term;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;

}
