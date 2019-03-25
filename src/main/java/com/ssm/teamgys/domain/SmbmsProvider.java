package com.ssm.teamgys.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *   鑫杰、佳毅 供应商信息
 *
 * */
public class SmbmsProvider {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long proId;
  private String proCode;
  private String proName;
  private String proDesc;
  /**
   * 联系
   */
  private String proContact;
  private String proPhone;
  private String proAddress;
  /**
   * 传真
   */
  private String proFax;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;


}
