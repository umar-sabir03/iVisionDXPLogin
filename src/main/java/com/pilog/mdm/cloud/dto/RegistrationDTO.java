/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pilog.mdm.cloud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class RegistrationDTO {
    @JsonProperty("first_name")
     private String firstName;
    @JsonProperty("middle_name")
    private String middle_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("nick_name")
    private String nick_name;
    @JsonProperty("phone_number")
    private String phone_number;
    @JsonProperty("mobile_number")
    private String mobile_number;
    @JsonProperty("email_id")
    private String email_id;
    @JsonProperty("date_of_birth")
    private String date_of_birth;
    private String date;
    private String month;
    private String year;
    @JsonProperty("user_name")
    private String user_name;
    private String password;
    @JsonProperty("confirm_password")
    private String confirm_password;
    private String region;
    private String country;
    private String orgName;
    private String filepath;
    private String locale;
    private String role;
    @JsonProperty("additional_role")
    private String additional_role;
    @JsonProperty("report_to")
    private String report_to;
    private String plant;
    private String address1;
    private String address2;
    private String purposeofReg;
    @JsonProperty("experience_summary")
    private String experience_summary;
    private MultipartFile file;
    private String instance;
}
