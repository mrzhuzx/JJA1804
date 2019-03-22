package com.ssm.teamgys.Repository;

import com.ssm.teamgys.entity.Horse;
import com.ssm.teamgys.repository.HorseRepository;
import lombok.extern.log4j.Log4j2;

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
@Log4j2
public class HorseRepositoryTest {

    @Autowired
    HorseRepository horseRepository;

    @Test
    public void testAdd(){

        Horse horse=new Horse();
        horse.setHorseName("化腾");
        horse.setHorsehobby("让人充钱");
        horse.setHorseage(45);
        horseRepository.save(horse);
        log.info("[添加一匹好马]"+horse.toString());
    }

    @Test
    public void testAddAll(){

        List<Horse> list=new ArrayList();

        for (int i = 0; i <10 ; i++) {

            Horse horse=new Horse();
            horse.setHorseName("化腾"+i);
            horse.setHorsehobby("让人充钱");
            horse.setHorseage(45);
            list.add(horse);
        }
        horseRepository.saveAll(list);
        log.info("[添加一批好马]"+list.size());
    }

    @Test
    public void testUpdate(){

        int rows=horseRepository.update(4,"充钱");
        log.info("[修改马信息]"+rows);
    }


    @Test
    public void testDel(){
        horseRepository.deleteById(1);;
    }


    @Test
    public void testSearch(){
        List<Horse> horselist= horseRepository.findAll();
        for (Horse h:horselist){
            log.info("[horselist]"+h.toString());
        }

    }


}
