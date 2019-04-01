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
public class ProductInfoController {

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


    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute ProductInfo pro  ,@RequestParam  Integer  abc){
        System.out.println(pro);
        pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
        productInfoService.save(pro);
        System.out.println(pro.toString());

        System.out.println("-----------------------------"+abc);
        Integer gg = pro.getProductStatus();
        System.out.println(gg+"+++++++++++++++++++++++");
        ModelAndView m = new ModelAndView("jsp/product");

        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);
        return m;

    }


    @RequestMapping(value = "/{proid}/searchone")

    public ModelAndView  update(  @PathVariable(value = "proid") String  searchone){


        ProductInfo one = productInfoService.findOne(searchone);

        ModelAndView  m =   new ModelAndView("jsp/product");

        m.addObject("proone",one);
        return m;
    }


//    @RequestMapping(value = "/{a}/{b}/show002") //rest/a/b/show002.do
//    public ModelAndView show002(@PathVariable(value = "a") String a,@PathVariable("b") String  userid) {
//
//        ModelAndView m = new ModelAndView("rest");
//
//        m.addObject("a", a);
//        m.addObject("userid",userid);
//        return m;
//    }




}