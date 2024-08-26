package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class OntgDefnitionsGuidId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "CONCEPT_ID", nullable = false, length = 120)
    private String conceptId;

    @Column(name = "CONCEPT_TYPE", nullable = false, length = 80)
    private String conceptType;

    @Column(name = "TERM_ID", nullable = false, length = 120)
    private String termId;

    @Column(name = "DEFINITION_ID", nullable = false, length = 120)
    private String definitionId;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;

}
