package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.ProductInfo;
import com.ssm.teamgys.service.OrderDetailService;
import com.ssm.teamgys.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/*
 * desc:
 * author:tanghuaming
 * time:2019\3\25 0025
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j // log.info()

 public class OrderDetailServiceImplTest {
   @Autowired
   OrderDetailService orderDetailService;
    @Test
    public void findOne() {
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
       ProductInfo pro = new ProductInfo();
       // Db  table 不存在

       pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
       pro.setProductName("拉不拉多");
       pro.setProductPrice(500.00);
       pro.setProductStock(10);
       pro.setProductDescription("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种" +
               "因原产地在加拿大的纽芬兰与拉布拉多省而得名。跟西伯利亚雪撬犬和金毛寻回犬并列三大无攻击性犬类。拉布拉多智商位列世界犬类第六位。个性忠诚、大气、憨厚、温和、阳光、开朗、活泼，智商极高，也对人很友善，\n" +
               "拉布拉多猎犬有四种颜色，分别为：黑色、黄色、巧克力、米白色。最常见的是黑色，黄色。" +
               "在美国犬业俱乐部中拉布拉多是目前登记数量最多的品种，对小孩尤其的友善，对犬主人略粘人。");
       pro.setProductIcon("https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg");
       // pro.setProductStatus(ProductStatusEnum.UP.getCode()); // 1    0  类中有默认值时会添加

       pro.setCategoryType(1);
       pro.setCreateTime(new Date());

       //2 时间 修改
       productInfoService.save(pro);
    }

}