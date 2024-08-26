package com.pilog.mdm.cloud.model.id;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class BLanguageId implements Serializable {
    @Column(name = "LANGUAGE_ID", unique = true, nullable = false, length = 120)
    private String languageId;

    @Column(name = "NAME", nullable = false, length = 200)
    private String name;


}