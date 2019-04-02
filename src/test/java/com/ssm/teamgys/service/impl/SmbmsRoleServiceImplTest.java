package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.SmbmsRole;
import com.ssm.teamgys.service.SmbmsRoleService;
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
public class SmbmsRoleServiceImplTest {
    @Autowired
    SmbmsRoleService smbmsRoleService;

    @Test
    public void testPage(){
        Sort sort=new Sort(Sort.Direction.ASC,"roleId");
        Integer pageNum=1;
        Integer size=5;

        PageRequest pageble=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"roleId"));

        Page<SmbmsRole> page= smbmsRoleService.findAll(pageble);
        List<SmbmsRole> smbmRoleList=page.getContent();
        for (int i = 0; i <smbmRoleList.size() ; i++) {

            SmbmsRole smbmRole=smbmRoleList.get(i);
            log.info(smbmRole.toString());

        }



    }


    @Test
    public void testAdd(){
        List<SmbmsRole> list=new ArrayList();

        for (int i = 0; i <10 ; i++) {

            SmbmsRole role = new SmbmsRole();

            role.setRoleCode("NO.1200002"+i);
            role.setRoleName("宇智波止水"+i+"号");
            role.setRoleDesc("客户"+i);
            role.setRoleStatus(1);
            list.add(role);

        }
        smbmsRoleService.saveAll(list);
        log.info("[添加一组客户]"+list.size());


    }


    @Test
    public void testSave(){
        SmbmsRole s=new SmbmsRole();
        s.setRoleCode("NO.1200001");
        s.setRoleName("马化腾");
        s.setRoleDesc("客户");
        s.setRoleStatus(1);
        smbmsRoleService.save(s);

    }

    @Test
    public  void testSearch(){
        List<SmbmsRole> smbmRoleList = smbmsRoleService.findAll();
        for(SmbmsRole sm:smbmRoleList){
            log.info("smbmrolist"+sm.toString());
        }
    }

    @Test
    public void testUpdate(){
       int rows= smbmsRoleService.update(2L,"李红艳","店员",0,"NO.12000020");

    }
    @Test
    public void testDel(){
        smbmsRoleService.deleteById("4");

    }
}




