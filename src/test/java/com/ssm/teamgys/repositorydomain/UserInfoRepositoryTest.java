package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void testPage(){


    }

    @Test
    public void testAdd(){

        List<UserInfo> list=new ArrayList();

        for (int i = 0; i <15 ; i++) {
            UserInfo info = new UserInfo();
            info.setUserCode("NO.1100002"+i);
            info.setUserName("马云"+i+"号");
            info.setUserPassword("123123"+i);
            info.setUserPhone("12580"+i);
            list.add(info);

        }
        userInfoRepository.saveAll(list);
        log.info("[添加了一组成员]"+list.size());
    }



    @Test
    public  void testSave(){
        UserInfo ui=new UserInfo();

        ui.setUserCode("NO.1100001");
        ui.setUserName("杰克马");
        ui.setUserPassword("123123");
        ui.setUserAddress("厦门市湖里区");
        ui.setUserPhone("12580110");

        userInfoRepository.save(ui);

    }

    @Test
    public void testSearch(){
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        for(UserInfo u:userInfoList){
            log.info("userlist"+u.toString());
        }
        }

        @Test
        public void testUpdate(){
         int rows=userInfoRepository.update(1L,"123","厦门市集美区","110120","马云");
        }

        @Test
    public void testDel(){
        userInfoRepository.deleteById(Long.valueOf(1));

        }

}
