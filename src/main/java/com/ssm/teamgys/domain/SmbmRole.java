package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  智鹏/吉松
 */

@Data
public class SmbmRole {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long roleId;
  /**
   * 编号
   */
  private String roleCode;
  /**
   * 角色名字
   */
  private String roleName;
  /**
   * 角色描述
   */
  private String roleDesc;
  /**
   * 角色状态
   */
  private Integer roleStatus;

  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;


}
