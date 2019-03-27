package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.appcomm.enums.SmbmsBillEnum;
import com.ssm.teamgys.domain.SmbmsBill;


import com.ssm.teamgys.service.SmbmsBillService;
import com.ssm.teamgys.repositorydomain.SmbmsBillRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SmbmsBillServiceImplTest {

    @Autowired
    SmbmsBillServiceImpl smbmsBillService;


    @Test
    public void findAll() {

        List<SmbmsBill> m = smbmsBillService.findAll();
        for (SmbmsBill smbmsBill : m
        ) {
            System.out.println(smbmsBill.toString());
        }

    }


    @Test
    public void findAllByPage() {
        Integer PageNum = 1;
        Integer size = 2;
        Pageable rt = new PageRequest(PageNum - 1, size, new Sort(Sort.Direction.ASC, "billId"));
        Page<SmbmsBill> page = smbmsBillService.findAll(rt);
        List<SmbmsBill> content = page.getContent();
        for (int i = 0; i < content.size(); i++) {
            SmbmsBill smbmsBill = content.get(i);
            log.info(smbmsBill.toString());
        }

    }

    @Test
    public void save() {

        SmbmsBill bill = new SmbmsBill();
        bill.setBillCode(MYUUID.getYYYYMMDDhhmmss());//流水号
        bill.setProductId(MYUUID.getYYYYMMDDhhmmss());
        bill.setProductName("拉不拉多");//产品名字
        bill.setProductDesc("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种");//产品描述
        bill.setProductUnit("条");//产品单位
        bill.setProductCount(8);//产品数量
        bill.setTotalPrice(888.00);// 产品价格
        bill.setIsPayment(0); //产品支付
        // bill.setCreationDate();
        // modifyDate;
        bill.setProviderId(12);//供应商Id
        bill.setProImg("https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg");//产品图片
        bill.setAddressId(12l);//送货地址ID
        smbmsBillService.save(bill);
    }

    @Test
    public void saveAll() {

        List<SmbmsBill> listBills = new ArrayList<>();
        Random  r=new Random();
        for (int i = 0; i < 20; i++) {
            SmbmsBill bill = new SmbmsBill();
            bill.setBillCode(MYUUID.getUUID());//流水号
            bill.setProductId(MYUUID.getYYYYMMDDhhmmss());
            bill.setProductName("拉不拉多"+(i+1)+"号");//产品名字
            bill.setProductDesc("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种");//产品描述
            bill.setProductUnit("条");//产品单位
            bill.setProductCount(r.nextInt(10)+1);//产品数量
            bill.setTotalPrice(r.nextInt(1000)+500.00);// 产品价格
//            bill.setIsPayment(SmbmsBillEnum.ISPAY_WAIT.getCode());
            bill.setIsPayment(r.nextInt(3)+1); //产品支付   0   1   2

            bill.setCreationDate(new Date());
            // modifyDate;
            bill.setProviderId(12);//供应商Id
            bill.setProImg("https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D21%2C0%2C980%2C647%3Bc0%3Dbaike116%2C5%2C5%2C116%2C38/sign=91c9a50cdd39b600598155f7d4620406/b999a9014c086e06999299a40a087bf40ad1cb23.jpg");//产品图片
            bill.setAddressId(12l);//送货地址ID
            listBills.add(bill);
        }

        smbmsBillService.saveAll(listBills);


    }


}