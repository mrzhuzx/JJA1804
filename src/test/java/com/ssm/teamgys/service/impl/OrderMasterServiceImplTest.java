package com.ssm.teamgys.service.impl;


import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.OrderMaster;
import com.ssm.teamgys.service.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * desc:
 * author:tanghuaming
 * time:2019\3\25 0025
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j // log.info()
public class OrderMasterServiceImplTest {

    @Autowired
    OrderMasterService orderMasterService;
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
        OrderMaster om = new OrderMaster();
        // Db  table 不存在
        om.setOrderId(MYUUID.getYYYYMMDDhhmmss());
        om.setBuyerName("树懒1号");
        om.setBuyerPhone("13850788535");
        om.setBuyerAddress("集美诚毅学院");
        om.setBuyerOpenid("12580");
        om.setOrderAmount(100.00);
        om.setOrderStatus(0);
        om.setPayStatus(0);


        //2 时间 修改
        orderMasterService.save(om);
    }
}