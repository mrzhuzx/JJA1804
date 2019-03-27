package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.ProductCategory;
import com.ssm.teamgys.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/3/27 0027
 * version: 1.2.3
 */
@Controller
@RequestMapping("/protype")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;


    @RequestMapping("/list")
    public ModelAndView list(){

        ModelAndView m=new ModelAndView("jsp/productCategory");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);

        return m;


    }


}
