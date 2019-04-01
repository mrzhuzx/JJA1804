package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmRole;
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
public class SmbmRoleRepositoryTest {

    @Autowired
    SmbmRoleRepository smbmRoleRepository;

    @Test
    public void testPage(){
        Sort sort=new Sort(Sort.Direction.ASC,"roleId");
        Integer pageNum=1;
        Integer size=5;

        PageRequest pageble=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"roleId"));

        Page<SmbmRole> page=smbmRoleRepository.findAll(pageble);
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
        smbmRoleRepository.saveAll(list);
        log.info("[添加一组客户]"+list.size());


    }


    @Test
    public void testSave(){
        SmbmRole s=new SmbmRole();
        s.setRoleCode("NO.1200001");
        s.setRoleName("马化腾");
        s.setRoleDesc("客户");
        s.setRoleStatus(1);
        smbmRoleRepository.save(s);

    }

    @Test
    public  void testSearch(){
        List<SmbmRole> smbmRoleList = smbmRoleRepository.findAll();
        for(SmbmRole sm:smbmRoleList){
            log.info("smbmrolist"+sm.toString());
        }
    }

    @Test
    public void testUpdate(){
        int rows=smbmRoleRepository.update(1L,"李红艳","店员",0,"NO.12000020");

    }
    @Test
    public void testDel(){
        smbmRoleRepository.deleteById(Long.valueOf(1));

    }
}
