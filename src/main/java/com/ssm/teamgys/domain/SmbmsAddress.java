package com.ssm.teamgys.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 鑫杰、佳毅
 */
@Data
@Entity
@Table
public class SmbmsAddress {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long addId;
  private String addContact; //联系人
  private String addDesc;//地址描述
  private String addPostCode;//邮递
  private String addTelPhone;//电话
  private java.sql.Timestamp creationDate;//创建时间
  private java.sql.Timestamp modifyDate;//修改时间




}
