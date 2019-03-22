package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Dog;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * desc:
 * author : tzhu
 * time :2019/3/22 0022
 * version: 1.2.3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class DogRepositoryTest {

    @Autowired
    DogRepository dogRepository;
    @Test
    public void testPage(){
     //import org.springframework.data.domain.Sort;
           Sort sort=new Sort(Sort.Direction.ASC,"dogId");//属性名dogid XXX
           //Sort sort=new Sort(Sort.Direction.DESC,"dogId");
            Integer pageNum=3; //  2   3页
            Integer size=5;

        Pageable pageable = new PageRequest(pageNum-1, size,new Sort(Sort.Direction.ASC,"dogId")); //根据start、size、sort创建分页对象
        //Pageable pageable = new PageRequest(pageNum-1, size,sort); //根据start、size、sort创建分页对象

        Page<Dog> page = dogRepository.findAll(pageable);

        Iterator<Dog> iter = page.iterator();
        System.out.println(page.getNumber());
        System.out.println(page.getSize());

        while (iter.hasNext()){
            Dog dog = iter.next();
            System.out.println(dog.toString());

        }




    }
    @Test
    public void testUpdateDogName(){

        int rows = dogRepository.updateDogName(3,"阿福");
        log.info("[修改狗信息]:"+rows);


    }

    @Test
    public void testUpdate(){

        int rows = dogRepository.update(2, "睡觉");
        log.info("[修改狗信息]:"+rows);


    }

    @Test
    public void testAdd() {

        Dog dog = new Dog();
        dog.setDogName("小汪");
        dog.setDogHobby(" 专业拆家 ");
        dog.setDogAge(5);
        dogRepository.save(dog);

        log.info("[添加一呆狗]" + dog.toString());

    }

    @Test
    public void testAddAll() {


        List<Dog>  list=new ArrayList();

        for (int i = 0; i < 10; i++) {

            Dog dog = new Dog();
            dog.setDogName("小汪"+i);
            dog.setDogHobby(" 专业拆家 ");
            dog.setDogAge(5);
            list.add(dog);
        }

        dogRepository.saveAll(list);
        //dogRepository.save(dog);

        log.info("[添加一群狗]" + list.size());

    }


    @Test
    public void testDel() {

        dogRepository.deleteById(1);

    }
    @Test
    public void testSearch() {
        List<Dog> dogList = dogRepository.findAll();

        for (Dog d
                : dogList
        ) {
            log.info("[dogList:]"+d.toString());
        }


    }


}