package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity //告诉JPA这是一个实体类（和数据表映射的类） //使用JPA注解配置映射关系
@Table(name = "Smbms_Bill") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
/**
 * 账单
 */
public class SmbmsBill {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private long id;
  
  private String billCode;//流水号
  
  private String productName;
  
  private String productDesc;
  
  private String productUnit;//单位
  
  private double productCount;
  
  private double totalPrice;
  
  private long isPayment;
  
  private long createdBy;
  
  private java.sql.Timestamp creationDate;
  
  private long modifyBy;
  
  private java.sql.Timestamp modifyDate;
  
  private long providerId;
  /**
   * 产品图片
   */
  private String proImg;




}
