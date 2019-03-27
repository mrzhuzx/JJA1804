package com.ssm.teamgys.service;

import com.ssm.teamgys.domain.SmbmsAddress;
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
import sun.rmi.runtime.NewThreadAction;


import java.util.ArrayList;
import java.util.List;



/**
 * time：2019/3/25--15:55
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class SmbmsAddressServiceTest {

    @Autowired
    SmbmsAddressService smbmsAddressService;


    @Test
    public void save(){
        SmbmsAddress smbmsAddress=new SmbmsAddress();
        smbmsAddress.setAddContact("加二二");
        smbmsAddress.setAddDesc("厦门市思明区软件园二期观日路28号");
        smbmsAddress.setAddPostCode("364333");
        smbmsAddress.setAddTelPhone("15559599777");
        smbmsAddressService.save(smbmsAddress);

    }
    @Test
    public void saveAll(){
        List<SmbmsAddress> list=new ArrayList<SmbmsAddress>();
        for (int i = 0; i <20; i++) {
            SmbmsAddress smbmsAddress=new SmbmsAddress();
            smbmsAddress.setAddContact("加三三"+i);
            smbmsAddress.setAddDesc("厦门市思明区软件园二期观日路28号");
            smbmsAddress.setAddPostCode("364333");
            smbmsAddress.setAddTelPhone("15559599777");
            list.add(smbmsAddress);

        }
        smbmsAddressService.saveAll(list);

    }

    @Test
    public void findAllPage(){
        Integer pageNum=1;
        Integer size=4;

        Pageable pageable=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"addId"));
        Page<SmbmsAddress> page = smbmsAddressService.findAll(pageable);
        List<SmbmsAddress> list = page.getContent();
        for (int i = 0; i < list.size(); i++) {
            SmbmsAddress smbmsAddress = list.get(i);
            System.out.println(smbmsAddress.toString());
        }
    }



    @Test
    public void updateById(){
        Integer integer = smbmsAddressService.updateById(1l,"多多");
        System.out.println("修改成功！" + integer);
    }

    @Test
    public void deleteById(){
        smbmsAddressService.deleteById("1");
    }

    @Test
    public void findAll(){

        List<SmbmsAddress> list = smbmsAddressService.findAll();
        for (int i = 0; i < list.size(); i++) {
            SmbmsAddress smbmsAddress=list.get(i);

            System.out.println(smbmsAddress.toString());
        }

    }

}