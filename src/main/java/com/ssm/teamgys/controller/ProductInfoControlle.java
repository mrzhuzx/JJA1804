package com.ssm.teamgys.controller;


import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.ProductInfo;

import com.ssm.teamgys.service.ProductInfoService;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-03-27  18:38:31
 */

@Controller
@RequestMapping("/product")
public class ProductInfoControlle {

    @Autowired
    ProductInfoService productInfoService;


    @RequestMapping("/pro")
    public ModelAndView list() {

        ModelAndView m = new ModelAndView("jsp/product");
        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);


        return m;

    }
    @RequestMapping("delete")
    public ModelAndView   delete(@RequestParam  String   productId){

        ModelAndView  m  = new ModelAndView("jsp/product");

        productInfoService.delete(productId);
        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);

        return m;
    }
//    @RequestMapping("update")
//
//    public   ModelAndView update(@RequestParam  String  productId,String productName,Double productPrice,Integer productStock,String productDescription,String productIcon,Integer productStatus,Integer categoryType){
//        ModelAndView m = new ModelAndView("jsp/updateproduct");
//
//        productInfoService.updaall( productId, productName, productPrice, productStock, productDescription, productIcon, productStatus, categoryType);
//
//        m.addObject("productId",productId);
//        m.addObject("productName",productName);
//        m.addObject("productPrice",productPrice);
//        m.addObject("productStock",productStock);
//        m.addObject("productDescription",productDescription);
//        m.addObject("productIcon",productIcon);
//        m.addObject("productStatus",productStatus);
//        m.addObject("categoryType",categoryType);
//
//
//        System.out.println(productId);
//
//        return  m;
//    }

    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute ProductInfo pro){

        pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
        productInfoService.save(pro);
        System.out.println(pro.toString());

        ModelAndView m = new ModelAndView("jsp/savepro");

        return m;

    }



}