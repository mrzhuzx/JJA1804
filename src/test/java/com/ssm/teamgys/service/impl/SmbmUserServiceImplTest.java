package com.ssm.teamgys.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmUser;
import com.ssm.teamgys.service.SmbmUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SmbmUserServiceImplTest {

    @Autowired
    SmbmUserService smbmUserService;

    /**
     * 增加
     */
    @Test
    public void testSave(){
        SmbmUser s=new  SmbmUser();
        s.setUserCode("NO.00000001");
        s.setUserName("男神松");
        s.setUserPassword("123123");
        s.setUserPhone("12580");

        smbmUserService.save(s);
        log.info("添加一个用户"+ smbmUserService.toString());

    }
    /**
     * 修改
     */
//    @Test
//    public void testUpdate(){
//        int rows = smbmUserService.
//    }

    /**
     * 删除
     */
    @Test
    public void testDel(){
        smbmUserService.deleteById("1");

    }
}
