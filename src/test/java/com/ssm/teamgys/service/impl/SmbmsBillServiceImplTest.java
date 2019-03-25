package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.SmbmsBill;

import com.ssm.teamgys.service.SmbmsBillService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SmbmsBillServiceImplTest   {
@Autowired
    SmbmsBillService smbmsBillService ;
   // @Test
    public void findAll() {
    }

   // @Test
    public void findAll1() {
    }

    //@Test
    public void findAll2() {
    }

    @Test
    public void save() {

        SmbmsBill bill = new SmbmsBill();
     //   bill.setBillCode(MYUUID.getYYYYMMDDhhmmss());//流水号
//        bill.setProductId(MYUUID.getYYYYMMDDhhmmss());
 //       bill.setProductName("拉不拉多");//产品名字
//        bill.setProductDesc("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种");//产品描述
//        bill.setProductUnit("条");//产品单位
//        bill.setProductCount(8);//产品数量
       bill.setTotalPrice(888.00);// 产品价格
//       bill.setIsPayment(0); //产品支付
//       // bill.setCreationDate();
//        // modifyDate;
//        bill.setProviderId(12);//供应商Id
//        bill.setProImg("https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg");//产品图片
//        bill.setAddressId(12l);//送货地址ID
        smbmsBillService.save(bill);


    }
}