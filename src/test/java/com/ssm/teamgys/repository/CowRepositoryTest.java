package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Cow;

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
import java.util.Iterator;
import java.util.List;


/**
 * desc:
 * author :you
 * time:2019-3-22 14:57:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class CowRepositoryTest {
    @Autowired
    CowRepository cowRepository;
    @Test
    public void testPage(){
        //import org.springframework.data.domain.Sort;
        Sort sort=new Sort(Sort.Direction.ASC,"userId");//属性名Cowid XXX
        //Sort sort=new Sort(Sort.Direction.DESC,"userId");
        Integer pageNum=3; //  2   3页
        Integer size=5;

        Pageable pageable = new PageRequest(pageNum-1, size,new Sort(Sort.Direction.ASC,"userId")); //根据start、size、sort创建分页对象
        //Pageable pageable = new PageRequest(pageNum-1, size,sort); //根据start、size、sort创建分页对象

        Page<Cow> page = cowRepository.findAll(pageable);
       page.interator();
        System.out.println(page.getNumber());
        System.out.println(page.getSize());

        while (iter.hasNext()){
            Cow Cow = iter.next();
            System.out.println(Cow.toString());

        }




    }
    @Test
    public void testUpdate(){
        int rows=cowRepository.update(2,"睡觉");
        log.info("[修改牛信息]:"+rows);
    }

    @Test
    public void testAdd() {

        Cow cow = new Cow();
        cow.setUserName("小白");
        cow.setUserHobby("你~~~好啊~~~");
        cow.setUserAge(5);
        cowRepository.save(cow);
        log.info("[添加一只牛]" + cow.toString());
    }
    @Test
    public void testAddAll() {

        List<Cow>list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            Cow cow = new Cow();
            cow.setUserName("小白");
            cow.setUserHobby("你~~~好啊~~~");
            cow.setUserAge(5);
            list.add(cow);
        }
        cowRepository.saveAll(list);
        log.info("添加一群牛"+list.size());
    }
    @Test
    public void testDel() {
        cowRepository.deleteById(1);
    }
    @Test
    public void testSearch() {
        List<Cow> cowList = cowRepository.findAll();
        for (Cow d
                : cowList
        ) {
log.info("[cowList]"+d.toString());
        }
    }
}