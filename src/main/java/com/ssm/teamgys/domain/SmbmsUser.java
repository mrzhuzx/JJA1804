package com.ssm.teamgys.domain;


import lombok.Data;

@Data
public class SmbmsUser {

  private long userId;
  private String userCode;
  private String userName;
  private String userPassword;
  private String userPhone;
  private String userAddress;
  private long roleId;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;



}
