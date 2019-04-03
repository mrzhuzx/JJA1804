package com.ssm.teamgys.appweb;

import com.ssm.teamgys.appweb.vo.ProductInfoVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * time：2019/4/3--10:46
 * Author:蓝鑫杰
 * desc：JSON练习！！！！！！！！！！
 * version:1.3.22
 */
@RestController
@RequestMapping("json/product")
public class LanxjDemoJSONController {

    @RequestMapping("map")
    public Map<String, List<ProductInfoVo>> map() {
        Map<String, List<ProductInfoVo>> map = new TreeMap<>();

        for (int i = 0; i < 5; i++) {
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            ProductInfoVo productInfoVo = new ProductInfoVo();
            for (int j = 0; j < 4; j++) {
                productInfoVo.setProductId(j + "");
                productInfoVo.setCategoryName("类别" + i);
                productInfoVo.setProductName("狗狗" + j + "号");
                productInfoVo.setProductPrice(300 + 1.00 + j);
                productInfoVo.setProductIcon("111111");
                productInfoVoList.add(productInfoVo);
            }
            map.put("类别" + i,productInfoVoList);
        }
        return map;
    }

}
