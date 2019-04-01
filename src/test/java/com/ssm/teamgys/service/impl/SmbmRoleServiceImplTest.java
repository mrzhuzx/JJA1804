package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.SmbmRole;
import com.ssm.teamgys.service.SmbmRoleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmbmRoleServiceImplTest {
    @Autowired
    SmbmRoleService smbmRoleService;

    @Test
    public void testPage(){
        Sort sort=new Sort(Sort.Direction.ASC,"roleId");
        Integer pageNum=1;
        Integer size=5;

        PageRequest pageble=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"roleId"));

        Page<SmbmRole> page=smbmRoleService.findAll(pageble);
        List<SmbmRole> smbmRoleList=page.getContent();
        for (int i = 0; i <smbmRoleList.size() ; i++) {

            SmbmRole smbmRole=smbmRoleList.get(i);
            log.info(smbmRole.toString());

        }



    }


    @Test
    public void testAdd(){
        List<SmbmRole> list=new ArrayList();

        for (int i = 0; i <10 ; i++) {

            SmbmRole role = new SmbmRole();

            role.setRoleCode("NO.1200002"+i);
            role.setRoleName("宇智波止水"+i+"号");
            role.setRoleDesc("客户"+i);
            role.setRoleStatus(1);
            list.add(role);

        }
        smbmRoleService.saveAll(list);
        log.info("[添加一组客户]"+list.size());


    }


    @Test
    public void testSave(){
        SmbmRole s=new SmbmRole();
        s.setRoleCode("NO.1200001");
        s.setRoleName("马化腾");
        s.setRoleDesc("客户");
        s.setRoleStatus(1);
        smbmRoleService.save(s);

    }

    @Test
    public  void testSearch(){
        List<SmbmRole> smbmRoleList = smbmRoleService.findAll();
        for(SmbmRole sm:smbmRoleList){
            log.info("smbmrolist"+sm.toString());
        }
    }

    @Test
    public void testUpdate(){
       int rows=smbmRoleService.update(2L,"李红艳","店员",0,"NO.12000020");

    }
    @Test
    public void testDel(){
        smbmRoleService.deleteById("4");

    }
}




