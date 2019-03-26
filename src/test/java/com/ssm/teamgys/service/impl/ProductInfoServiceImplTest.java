package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;

import com.ssm.teamgys.appcomm.enums.ProductStatusEnum;
import com.ssm.teamgys.domain.ProductInfo;

import com.ssm.teamgys.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * desc:
 * author : zhs
 * time :2019-03-26  11:01:05
 * version: 1.2.3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j // log.info()
public class ProductInfoServiceImplTest {
    //导入数据仓库
    @Autowired
    ProductInfoService productInfoService;


    @Test
    public   void   findeOne(){
        //查一条?
        ProductInfo one = productInfoService.findOne("20190326-092123-00237676");

    }

    @Test
    public void findUpAll() {

    }

    @Test
    public void delet() {
   //删一条
        productInfoService.delete("20190325-034613-00135906");
    }


    @Test
    public void findsearch() {

        //查所有
        List<ProductInfo> all = productInfoService.findsearch();

        for (ProductInfo listall : all
        ) {
            System.out.println(listall.toString());
        }

    }@Test
    public void updateone() {
//更新一条
        productInfoService.updateone("20190326-092124-00241280",0);

    }

    @Test
    public void findAll() {
        //查询带分页
        Sort sort=new Sort(Sort.Direction.ASC,"productId");//属性名dogid XXX

        Integer pageNum=2; //  2   3页
        Integer size=2;

        PageRequest pageable = new PageRequest(pageNum-1, size,new Sort(Sort.Direction.ASC,"productId")); //根据start、size、sort创建分页对象

        Page<ProductInfo> page = productInfoService.findAll(pageable);

        List<ProductInfo> content = page.getContent();

        for (int i = 0; i < content.size(); i++) {

            ProductInfo   pro = content.get(i);
            log.info(pro.toString());
        }
    }

    @Test
    public void save() {
//存一条
        Random  r = new Random();
        ProductInfo pro = new ProductInfo();
        // Db  table 不存在

        pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
        pro.setProductName("拉不拉多");
        pro.setProductPrice(r.nextInt(200)+300.00);
        pro.setProductStock(10);
        pro.setProductDescription("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种" +
                "因原产地在加拿大的纽芬兰与拉布拉多省而得名。跟西伯利亚雪撬犬和金毛寻回犬并列三大无攻击性犬类。拉布拉多智商位列世界犬类第六位。个性忠诚、大气、憨厚、温和、阳光、开朗、活泼，智商极高，也对人很友善，\n" +
                "拉布拉多猎犬有四种颜色，分别为：黑色、黄色、巧克力、米白色。最常见的是黑色，黄色。" +
                "在美国犬业俱乐部中拉布拉多是目前登记数量最多的品种，对小孩尤其的友善，对犬主人略粘人。");
        pro.setProductIcon("https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg");
         pro.setProductStatus(ProductStatusEnum.DOWN.getCode()); // 1    0  类中有默认值时会添加
        pro.setCategoryType(1);
        pro.setCreateTime(new Date());
           //2 时间 修改
         productInfoService.save(pro);
    }
    @Test

    public void saveall() {
        //存好几条
        ProductInfo pro = new ProductInfo();

        Random  r = new Random();
        for (int i = 0; i <10 ; i++) {
            pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
            pro.setProductName("阿拉斯加"+i+"号");
            pro.setProductPrice(r.nextInt(300)+600.00);
            pro.setProductStock(20);
            pro.setProductDescription("阿拉斯加雪橇犬结实、有力、肌肉发达而且胸很深。当它们站立时，头部竖直，眼神显得警惕、好奇，给人的感觉是充满活力而且非常傲娇。头部宽阔，耳朵呈三角形，警惕状态时保持竖立。口吻大，宽度从根部向鼻尖渐收，口吻既不显得长而突出，也不显得粗短。被毛浓密，披毛有足够的长度以保护内层柔软的底毛。阿拉斯加雪橇犬有各种不同的颜色，如灰、黑白、红棕。培育它的目的是为了耐力而不是速度，因为它们的主要用途是拉雪橇。");
            pro.setProductIcon("https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=59004a83be8f8c54f7decd7d5b404690/314e251f95cad1c851d7704a753e6709c93d516b.jpg");
            pro.setProductStatus(ProductStatusEnum.UP.getCode()); // 1    0  类中有默认值时会添加
            pro.setCategoryType(1);
            pro.setCreateTime(new Date());
            productInfoService.save(pro);
        //2 时间 修改
        }

        System.out.println(pro.toString());




    }

}