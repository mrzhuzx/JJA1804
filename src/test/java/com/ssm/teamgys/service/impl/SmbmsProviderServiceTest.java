package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.SmbmsProvider;
import com.ssm.teamgys.service.SmbmsProviderService;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;


/**
 * time：2019/3/25--15:55
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Log4j2
public class SmbmsProviderServiceTest {
    @Autowired
    SmbmsProviderService smbmsProviderService;

    @Test
    public void testadd(){
        SmbmsProvider smbmsProvider=new SmbmsProvider();
        smbmsProvider.setProCode(MYUUID.getUUID());
        smbmsProvider.setProName("拉布拉多");
        smbmsProvider.setProDesc("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种");
        smbmsProvider.setProContact("加一一");
        smbmsProvider.setProPhone("15559599777");
        smbmsProvider.setProAddress("厦门思明区软件园二期观日路28号");
        smbmsProvider.setProFax("0592-77778888");
        smbmsProviderService.save(smbmsProvider);

    }
    @Test
    public void testAddAll(){
        ArrayList<SmbmsProvider> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {

            SmbmsProvider smbmsProvider=new SmbmsProvider();
            smbmsProvider.setProCode(MYUUID.getUUID());
            smbmsProvider.setProName("拉布拉多"+i);
            smbmsProvider.setProDesc("拉布拉多又称寻回犬，是一种大型犬类，是非常适合被选作经常出入公共场合的导盲犬或地铁警犬及搜救犬和其他工作犬的狗品种");
            smbmsProvider.setProContact("加一一");
            smbmsProvider.setProPhone("15559599777");
            smbmsProvider.setProAddress("厦门思明区软件园二期观日路28号");
            smbmsProvider.setProFax("0592-77778888");
            list.add(smbmsProvider);
        }
        smbmsProviderService.saveAll(list);
    }

    @Test
    public void testFindAllPage(){
        Integer pagenum=1;
        Integer sizi=4;
        Pageable pageable=new PageRequest(pagenum-1,sizi,new Sort(Sort.Direction.ASC,"proId"));
        Page<SmbmsProvider> page = smbmsProviderService.findAll(pageable);
        List<SmbmsProvider> list = page.getContent();
        for (int i = 0; i < list.size(); i++) {
            SmbmsProvider smbmsProvider = list.get(i);
            System.out.println(smbmsProvider.toString());
        }
    }
    @Test
    public void testFindAll(){
        List<SmbmsProvider> list = smbmsProviderService.findAll();
        for (int i = 0; i < list.size(); i++) {
            SmbmsProvider smbmsProvider = list.get(i);
            System.out.println(smbmsProvider.toString());
        }
    }
    @Test
    public void updateById(){
        Integer integer = smbmsProviderService.updateById(1L,"多多");
        System.out.println("修改成功！" + integer);
    }
    @Test
    public void deleteById(){
        smbmsProviderService.deleteById("1");
    }

}