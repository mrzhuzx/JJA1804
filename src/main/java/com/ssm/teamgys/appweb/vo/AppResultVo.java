package com.ssm.teamgys.appweb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ssm.teamgys.domain.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/4/3 0003
 * version: 1.2.3
 */
@Data
public class AppResultVo {

    /** 类目名字. */
    //@JsonProperty("cls")
    private String categoryName;
    private  List<ProductInfoVo>  proList;




}
