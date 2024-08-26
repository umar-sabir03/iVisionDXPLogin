package com.pilog.mdm.cloud.model.id;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class SPersnolisationId implements Serializable {
    @Column(name = "PERS_ID", nullable = false)
    private String persId;

    @Column(name = "TYPE", nullable = false, length = 400)
    private String type;

    @Column(name = "FILE_NAME", nullable = false, length = 1000)
    private String fileName;
}
