package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Dog;
import com.ssm.teamgys.entity.Tiger;
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
 * desc:
 * author:czf
 * time:2019\3\22 0022
 * version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class TigerRepositoryTest {
    @Autowired
    TigerRepository tigerRepository;
    @Test
    public void testPage(){
        Sort sort = new Sort(Sort.Direction.ASC,"tigerId");
        Integer pageNum = 3;
        Integer size =5;
        Pageable pageable = new PageRequest(pageNum - 1, size, new Sort(Sort.Direction.ASC, "tigerId"));
        Page<Tiger> page = tigerRepository.findAll(pageable);
        Iterator<Tiger> iter = page.iterator();
        System.out.println(page.getNumber());
        System.out.println(page.getSize());
        while (iter.hasNext()){
            Tiger tiger=iter.next();
            System.out.println(tiger.toString());
        }

    }
    @Test
    public void testUpdate(){
        int rows = tigerRepository.update(2, "开赛车");
        log.info("[修改老虎信息：]"+rows );

    }
    @Test
    public void testAddAll(){
        List<Tiger>list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Tiger tiger = new Tiger();
            tiger.setTigerName("虎小二");
            tiger.setTigerAge(5);
            tiger.setTigerHobby("游泳");

            list.add(tiger);
        }
        tigerRepository.saveAll(list);
    }
    @Test
    public void testAdd() {
        Tiger tiger = new Tiger();
        tiger.setTigerName("虎三");
        tiger.setTigerAge(4);
        tiger.setTigerHobby("吃火锅");
        tigerRepository.save(tiger);
        log.info("[添加一只老虎]"+tiger.toString());
    }
    @Test
    public void testDel(){
        tigerRepository.deleteById(1);
    }
    @Test
    public void testSearch(){
        List<Tiger> tigerList = tigerRepository.findAll();
        for (Tiger t
                :tigerList
             ) {log.info("[tigerList:]"+t.toString());
            
        }
    }

}