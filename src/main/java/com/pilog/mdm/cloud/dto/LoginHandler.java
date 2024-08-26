/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pilog.mdm.cloud.dto;

import lombok.Data;

@Data
public class LoginHandler {

    private String rsUsername;
    private String rsPassword;
    private String ssAutoStart;
    private String language;
    private String otp;

    

}
