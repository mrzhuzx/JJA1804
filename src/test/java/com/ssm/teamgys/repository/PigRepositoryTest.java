package com.ssm.teamgys.repository; /*
 *desc:
 *author:wjs
 *time:2019/3/22 0022
 *version:1.2.3
 */


import com.ssm.teamgys.entity.Pig;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class PigRepositoryTest {

    @Autowired
    PigRepository pigRepository;

    /**
     * 修改
     */
    @Test
    public void testUpdate(){

        int rows = pigRepository.updatePig(2,"打呼噜");
        log.info("[修改猪信息]："+rows);

    }
    /**
     * 添加
      */
    @Test
    public void testAdd(){

        Pig pig = new Pig();
        pig.setPigName("小猪猪");
        pig.setPigHobby("抠鼻");
        pig.setPigAge(12);

        pigRepository.save(pig);
        log.info("[添加一只小猪猪]"+pig.toString());

    }

    /**
     * 删除
     */
    @Test
    public void testDel(){

        pigRepository.deleteById(1);

    }

    /**
     *查询
     */
    @Test
    public void testSearch(){
        List<Pig> pigList = pigRepository.findAll();

        for (Pig p:pigList){
            log.info("[pigList:]"+p.toString());
        }

    }




}
