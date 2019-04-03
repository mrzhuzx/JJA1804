package com.ssm.teamgys.appweb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ssm.teamgys.appcomm.enums.ProductStatusEnum;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;


/**
 * desc:
 * author : tzhu
 * time :2019/4/3 0003
 * version: 1.2.3
 */
@Data
public class ProductInfoVo {
//{id:"1",name:"纯瘦肉",cls:"肉品",price:"15",sels:"45",imageUrl:"images/1.jpg"}
    @JsonProperty("id")
    private String productId;
    /** 名字. */
    @JsonProperty("name")
    private String productName;

    @JsonProperty("cls")
    private String categoryName;

    /** 单价. */
    @JsonProperty("price")
    private Double productPrice;
    /**购买数量*/
    @JsonProperty("sels")
    private    Integer  sels;

    /** 小图. */
    @JsonProperty("imageUrl")
    private String productIcon;




}
