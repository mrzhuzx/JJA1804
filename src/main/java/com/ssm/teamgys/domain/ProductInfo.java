package com.ssm.teamgys.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ssm.teamgys.appcomm.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * Created by zhuzx
 * 2017-05-09 11:30
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id //uuid
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private Double productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 1 正常   0下架. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

/*    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }*/
}
