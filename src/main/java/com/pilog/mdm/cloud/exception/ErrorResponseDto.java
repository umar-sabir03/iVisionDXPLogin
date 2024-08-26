package com.pilog.mdm.cloud.exception;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ErrorResponseDto {
    private String message;
    private String timestamp;
    private Integer status;
    private String errorCode;
}
