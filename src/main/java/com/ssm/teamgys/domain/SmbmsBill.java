package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity //告诉JPA这是一个实体类（和数据表映射的类） //使用JPA注解配置映射关系
@Table(name = "Smbms_Bill") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
/**
 *    鑫杰、佳毅  账单
 */
public class SmbmsBill {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long billId;

    private String billCode;//流水号
    /**
     * 产品ID
     */
    private String productId;
    /**
     * 产品名字
     */
    private String productName;
    /**
     * 产品描述
     */
    private String productDesc;
    /**
     * 产品单位
     */
    private String productUnit;
    /**
     * 产品数量
     */
    private Integer productCount;
    /**
     * 产品价格
     */
    private Double totalPrice;
    /**
     * 产品支付
     */
    private Integer isPayment; //


    private java.sql.Timestamp creationDate;


    private java.sql.Timestamp modifyDate;
    /**
     * 供应商Id
     */
    private long providerId;
    /**
     * 产品图片
     */
    private String proImg;
    /**
     * 送货地址
     */
    private Long addressId;


}
