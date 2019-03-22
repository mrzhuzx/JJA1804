package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Brid;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class BridRepositoryTest {
    @Autowired
    BridRepository bridRepository;

    @Test
    public void testadd(){

        Brid b=new Brid();
        b.setBridName("鹦鹉");
        b.setBridColor("花花绿绿");
        bridRepository.save(b);
        log.info("添加了一只鸟："+b.toString());

    }

    @Test
    public void Tupdate(){
        bridRepository.update(1,"红红火火");
    }

}