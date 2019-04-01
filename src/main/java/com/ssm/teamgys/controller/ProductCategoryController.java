package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.ProductCategory;
import com.ssm.teamgys.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam String categoryId, HttpServletResponse response)throws IOException {
        ModelAndView m=new ModelAndView("jsp/productCategory");

        System.out.println(categoryId);
        System.out.println("——————-----————————");


      productCategoryService.deleteById(categoryId);

        response.setContentType("text/html;charset=utf-8");
       //PrintWriter out = response.getWriter();
       //out.print("<script language=\"javascript\">alert('删除成功！')</script>");
       //out.flush();
       //out.close();
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
       m.addObject("productCategoryList", productCategoryList);
       return m;

    }
    @RequestMapping("/update")


    public ModelAndView delete(@RequestParam String categoryId)throws IOException {


        ModelAndView m=new ModelAndView("jsp/form");
         ProductCategory productCategory = productCategoryService.findbyid(categoryId);
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);
        m.addObject("productCategory", productCategory);


        return m;
    }
    @RequestMapping("/type")
    public ModelAndView type(){

        ModelAndView m=new ModelAndView("jsp/form");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);

        return m;


    }
}
