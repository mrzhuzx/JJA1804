package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Dog;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    public void testUpdate(){

        int rows = dogRepository.update(2, "睡觉");
        log.info("[修改狗信息]:"+rows);


    }

    @Test
    public void testAdd() {
        Dog dog = new Dog();
        dog.setDogName("小汪");
        dog.setDogHobby("  滚~~~毛线~~~~ ");
        dog.setDogAge(5);
        dogRepository.save(dog);
        log.info("[添加一呆狗]" + dog.toString());

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