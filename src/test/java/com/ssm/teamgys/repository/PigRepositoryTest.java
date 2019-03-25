package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Pig;
import lombok.extern.log4j.Log4j2;
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

/*
 *desc:
 *author:wjs
 *time:2019/3/22 0022
 *version:1.2.3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class PigRepositoryTest {

    @Autowired
    PigRepository pigRepository;

    @Test
    public void testPage(){
        Sort sort = new Sort(Sort.Direction.ASC, "pigId"); //pigId注意大小写
       Integer pageNum=1; // 分页（第几页）
        Integer size=4; //每页几条数据

        Pageable pageable = new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"pigId"));//(升序)根据start、size、sort创建分页对象

        Page<Pig> page = pigRepository.findAll(pageable);

        List<Pig> pigs = page.getContent();

        List<Pig> pigList = page.getContent();
        for (int i = 0; i <pigList.size(); i++) {

            Pig pig = pigList.get(i);
            log.info(pig.toString());

        }
    }
    @Test
    public void testUpdatePigName(){

        int rows = pigRepository.updatePig(2, "摊着");
        log.info("[修改猪信息]："+rows);

    }


    /**
     * 修改
     */
    @Test
    public void testUpdate(){

        int rows = pigRepository.updatePig(2, "打呼噜");
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
    @Test
    public void testAddAll(){

        List<Pig> list=new ArrayList<>();

        for (int i = 0; i <10; i++) {

            Pig pig = new Pig();
            pig.setPigName("小猪猪"+i);
            pig.setPigHobby("抠鼻");
            pig.setPigAge(12);
            list.add(pig);
        }

        pigRepository.saveAll(list);
        log.info("[添加一群小猪猪]"+list.size());

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
