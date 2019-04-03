package com.ssm.teamgys.appweb;


import com.ssm.teamgys.appweb.vo.AppResultVo;
import com.ssm.teamgys.appweb.vo.ProductInfoVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/26 0026
 */
@RestController
@RequestMapping("app/product")
public class Demo01JSONController {

    @RequestMapping("/mapbuy")
    public Map<String, List<ProductInfoVo>> mapdb() {

        Map<String, List<ProductInfoVo>> map = new TreeMap<>();
        //service


        return  map;

    }



    @RequestMapping("/map")
    public Map<String, List<ProductInfoVo>> map() {
        Map<String, List<ProductInfoVo>> map = new TreeMap<>();
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            List<ProductInfoVo> list = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                ProductInfoVo pro = new ProductInfoVo();
                pro.setCategoryName("类型" + i);

                pro.setProductIcon("images/"+(r.nextInt(29)+1)+".jpg");
                pro.setProductId(j + "");
                pro.setProductName("产品name");
                pro.setProductPrice(123.00);
                pro.setSels(500);
                list.add(pro);
            }
            map.put("类型" + i, list);
        }

        return map;
    }


    @RequestMapping("/list")
    public List<AppResultVo> list() {

        List<AppResultVo> appResultVoList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            AppResultVo appResultVo = new AppResultVo();

            appResultVo.setCategoryName("类型" + i);
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (int j = 0; j < 4; j++) {

                ProductInfoVo pro = new ProductInfoVo();

                pro.setCategoryName("类型" + i);
                pro.setProductIcon("images/21.jpg");
                pro.setProductId(j + "");
                pro.setProductName("产品name");
                pro.setProductPrice(123.00);
                pro.setSels(500);
                productInfoVoList.add(pro);

            }
            appResultVo.setProList(productInfoVoList);
            appResultVoList.add(appResultVo);
        }


        return appResultVoList;
    }


}
