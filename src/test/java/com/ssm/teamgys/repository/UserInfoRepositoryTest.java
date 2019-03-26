package com.ssm.teamgys.repository;


import com.ssm.teamgys.domain.UserInfo;
import com.ssm.teamgys.repositorydomain.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:zhs
 * time:time
 */

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository userInfoRepository;
    @Test

    public   void  search(){

        List<UserInfo> all = userInfoRepository.findAll();

        for (UserInfo   listall:all
             ) {
            System.out.println(listall.toString());
        }

    }


}