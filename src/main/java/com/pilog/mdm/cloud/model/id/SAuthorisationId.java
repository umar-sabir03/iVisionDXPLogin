package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SAuthorisationId implements Serializable {
    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "PASS_PHRASE", nullable = false, length = 600)
    private String passPhrase;

}
