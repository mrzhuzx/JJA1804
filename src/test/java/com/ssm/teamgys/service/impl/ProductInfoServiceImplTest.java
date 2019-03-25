package com.ssm.teamgys.service.impl;


import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.OrderDetail;
import com.ssm.teamgys.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * desc:
 * author : tzhu
 * time :2019/3/25 0025
 * version: 1.2.3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j // log.info()
public class OrderDetailInfoServiceImplTest {

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

        OrderDetail od = new OrderDetail();
        // Db  table 不存在
        od.setDetailId("10110114125");
        od.setProductId("123");
        od.setProductName();
        od.setProductPrice();
        od.setProductQuantity();
        od.setProductIcon();

           //2 时间 修改
        orderDetailService.save(od);


    }
}