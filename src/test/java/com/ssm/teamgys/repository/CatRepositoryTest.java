package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Cat;
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

import static org.junit.Assert.*;

/**
 * time：2019/3/2214:45
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class CatRepositoryTest {
    @Autowired
    CatRepository catRepository;
    @Test
    public void testadd(){
        Cat cat=new Cat();
        cat.setCatName("小花");
        cat.setCatAge("5");
        cat.setCatColor("红色");
        catRepository.save(cat);
        log.info("保存小猫"+cat.toString());
    }
    @Test
    public void testdelete(){
        catRepository.deleteById(1);
        log.info("小猫已删除！！！");
    }
    @Test
    public void testfind(){
        List<Cat> all = catRepository.findAll();
        for (Cat c:all) {
            System.out.println(c.toString());
        }
    }
    @Test
    public void testupdate(){

        int rows = catRepository.update(2, "小草");
        log.info("已修改小猫"+rows);
    }
    @Test
    public void testupdateName(){

        int rows = catRepository.updateName(3,"10");
        log.info("已修改小猫"+rows);
    }
    @Test
    public void testAddAll(){
        List<Cat> catList=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            Cat cat=new Cat();
            cat.setCatName("小花"+i);
            cat.setCatAge("5");
            cat.setCatColor("红色");
            catList.add(cat);
        }
        catRepository.saveAll(catList);
        log.info("添加一群猫："+catList.size());
    }
    @Test
    public void testPage(){
        Integer pageNum=1;
        Integer size=4;

        Pageable pageable=new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"catId"));

        Page<Cat> page = catRepository.findAll(pageable);
        List<Cat> cats = page.getContent();
        for (int i = 0; i < cats.size(); i++) {
            Cat cat=cats.get(i);
            System.out.println(cat.toString());

        }
//        Iterator<Cat> iterator=page.iterator();
//        while (iterator.hasNext()){
//            Cat cat=iterator.next();
//            System.out.println(cat.toString());
//        }
    }
}