package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.OrderDetail;
import com.ssm.teamgys.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
 * desc:
 * author:tanghuaming
 * time:2019\3\25 0025
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j // log.info()

 public class OrderDetailServiceImplTest {
   @Autowired
   OrderDetailService orderDetailService;
    @Test
    public void findOne() {

       OrderDetail detail = orderDetailService.findOne("10110114124");




    }
    @Test
    public void delete() {
        orderDetailService.delete("10110114125");

    }

    @Test
    public void findUpAll() {
        List<OrderDetail> all = orderDetailService.findUpAll();
        for (OrderDetail i:all) {
            System.out.println(i);
        }

    }



    @Test
    public void save() {
        OrderDetail od = new OrderDetail();
        // Db  table 不存在
        od.setDetailId("10110114125");
        od.setProductId("4124");
        od.setProductName("三鹿奶粉");
        od.setProductPrice(100.00);
        od.setProductQuantity(5);
        od.setProductIcon("图片地址");


        //2 时间 修改
        orderDetailService.save(od);
    }
    @Test
    public void update() {
        OrderDetail od = new OrderDetail();
        // Db  table 不存在
        od.setDetailId("10110114125");

        od.setProductName("三鹿奶粉有毒");



        //2 时间 修改
        orderDetailService.save(od);
    }

}