package com.ssm.teamgys.Repository;

import com.ssm.teamgys.entity.Horse;
import com.ssm.teamgys.repository.HorseRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        horseRepository.save(horse);
        log.info("[添加一匹好马]"+horse.toString());
    }


}
