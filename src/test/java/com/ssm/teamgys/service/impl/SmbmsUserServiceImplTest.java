package com.ssm.teamgys.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmsUser;
import com.ssm.teamgys.service.SmbmsUserService;
import lombok.extern.slf4j.Slf4j;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SmbmsUserServiceImplTest {

    @Autowired
    SmbmsUserService smbmsUserService;

    /**
     * 增加
     */
    @Test
    public void testSave(){
        SmbmsUser s=new  SmbmsUser();
        s.setUserCode("NO.00000001");
        s.setUserName("阿松");
        s.setUserPassword("123123");
        s.setUserPhone("139600");

            smbmsUserService.save(s);

    }
    /**
     * 修改
     */
    @Test
    public void testUpdate(){
        int rows = smbmsUserService.update("NO.11122222","男神AAAA","123124","123456",2L);
    }

    /**
     * 删除
     */
    @Test
    public void testDel(){
        smbmsUserService.deleteById("1");

    }
    /**
     * 查询
     */
    @Test
    public  void findAll(){

        List<SmbmsUser> su = smbmsUserService.findAll();
        for (SmbmsUser smbmUser : su){
            System.out.println(smbmUser.toString());
        }
    }
    /**
     * 添加多条数据
     */
    @Test
    public void saveAll(){

        List<SmbmsUser> listUser = new ArrayList<>();
        for (int i = 0; i <15; i++) {
            SmbmsUser s=new  SmbmsUser();
            s.setUserCode("NO.00000001");
            s.setUserName("男神松");
            s.setUserPassword("123123");
            s.setUserPhone("12580");
            listUser.add(s);

        }
        smbmsUserService.saveAll(listUser);

    }

    /**
     * 分页
     */
    @Test
    public void findAllByPage() {
        Integer PageNum=1;
        Integer size=4;
        Pageable rt =new PageRequest(PageNum-1,size,new Sort(Sort.Direction.ASC,"userId"));
        Page<SmbmsUser> page = smbmsUserService.findAll(rt);
        List<SmbmsUser> content = page.getContent();
        for (int i = 0; i <content.size() ; i++) {
            SmbmsUser smbmUser = content.get(i);
            log.info(smbmUser.toString());
        }
    }

}
