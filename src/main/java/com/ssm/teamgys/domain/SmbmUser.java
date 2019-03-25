package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *      智鹏/吉松   后台管理员
 */

@Data
public class SmbmUser {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long userId;
  private String userCode;
  private String userName;
  private String userPassword;
  private String userPhone;
  private Long roleId;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;


}
