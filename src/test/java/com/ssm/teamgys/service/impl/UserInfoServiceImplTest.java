package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.UserInfo;
import com.ssm.teamgys.service.UserInfoService;
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
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserInfoServiceImplTest {



        @Autowired
        UserInfoService userInfoService;
        @Test
        public void test(){
            System.out.println(userInfoService);

        }

        @Test
        public void testPage() {

            Sort sort = new Sort(Sort.Direction.ASC, "userId");
            Integer pageNum = 1;
            Integer size = 5;

            PageRequest pageble = new PageRequest(pageNum - 1, size, new Sort(Sort.Direction.ASC, "userId"));

            Page<UserInfo> page = userInfoService.findAll(pageble);
            List<UserInfo> userInfoList = page.getContent();
            for (int i = 0; i < userInfoList.size(); i++) {

                UserInfo userInfo = userInfoList.get(i);
                log.info(userInfo.toString());

            }
        }

   @Test
    public void testAdd(){

        List<UserInfo> list=new ArrayList();

        for (int i = 0; i <15 ; i++) {
            UserInfo info = new UserInfo();
            info.setUserAddress("湖里小区"+i+"栋");
            info.setUserCode("NO.1100002"+i);
            info.setUserName("马云"+i+"号");
            info.setUserPassword("123123"+i);
            info.setUserPhone("12580"+i);
            list.add(info);

        }
        userInfoService.saveAll(list);
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

        userInfoService.save(ui);

    }

    @Test
    public void testSearch(){
        List<UserInfo> userInfoList = userInfoService.findAll();
        for(UserInfo userInfo:userInfoList){
            log.info("userlist"+userInfo.toString());
        }
    }

    @Test
    public void testUpdate(){
       int rows=userInfoService.update(3L,"12312","厦门集美区","15268","李想");
    }

   @Test

    public void testDel(){
        userInfoService.deleteById("2");

    }







}
