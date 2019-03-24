package com.ssm.teamgys.domain;


import lombok.Data;

@Data
public class SmbmsRole {

  private long id;
  private String roleCode;
  private String roleName;
  private String roleDesc;
  private String rolestatus;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;


}
