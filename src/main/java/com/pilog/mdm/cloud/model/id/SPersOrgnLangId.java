package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SPersOrgnLangId implements Serializable {
    @Column(name = "ORGN_ID", nullable = false)
    private String orgnId;

    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "LANGUAGE_ID", nullable = false, length = 120)
    private String languageId;

    @Column(name = "LOCALE", nullable = false, length = 20)
    private String locale;
}
