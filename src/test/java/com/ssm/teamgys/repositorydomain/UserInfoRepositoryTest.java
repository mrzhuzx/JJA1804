package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.UserInfo;
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
public class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void testPage(){

        Sort sort=new Sort(Sort.Direction.ASC,"userId");
        Integer pageNum=1;
        Integer size=5;

        PageRequest pageble=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"userId"));

        Page<UserInfo> page=userInfoRepository.findAll(pageble);
        List<UserInfo> userInfoList=page.getContent();
        for (int i = 0; i <userInfoList.size() ; i++) {

           UserInfo userInfo= userInfoList.get(i);
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
         int rows=userInfoRepository.update(33L,"123","厦门市集美区","110120","马云");
        }

        @Test
    public void testDel(){
        userInfoRepository.deleteById(Long.valueOf(32));

        }

}
