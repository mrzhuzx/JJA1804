package com.ssm.teamgys.domain;

import lombok.Data;

import javax.persistence.*;

/**
 *   鑫杰、佳毅 供应商信息
 *
 * */
@Data
@Entity
@Table
public class SmbmsProvider {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long proId;
  private String proCode;//产品编码
  private String proName;//产品名字
  private String proDesc;//产品描述
  /**
   * 联系
   */
  private String proContact;//联系
  private String proPhone;//电话
  private String proAddress;//地址
  /**
   * 传真
   */
  private String proFax;//传真
  private java.sql.Timestamp creationDate;//创建时间
  private java.sql.Timestamp modifyDate;//修改时间


}
