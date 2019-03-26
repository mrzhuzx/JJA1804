package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;

/**
 *      智鹏/吉松   后台管理员
 */
@Entity
@Table(name="SmbmUser")
@Data
public class SmbmUser {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long userId;
  private String userCode; //会员编码
  private String userName;
  private String userPassword;
  private String userPhone;
  private Long roleId; //角色ID
  private java.sql.Timestamp creationDate; //创建日期
  private java.sql.Timestamp modifyDate;//修改日期


}
