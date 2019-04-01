package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.Guanggao;
import lombok.extern.slf4j.Slf4j;
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
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GuanggaoServiceImplTest {
    @Autowired
    GuanggaoServiceImpl guanggaoService;

    @Test
    public void findAll() {
    }

    @Test
    public void findAllById() {
        Sort sort=new Sort(Sort.Direction.ASC,"ggId");
        Integer pageNum=2; //  2   3页
        Integer size=5;

        Pageable pageable =new PageRequest(pageNum-1,size,new Sort(Sort.Direction.ASC,"ggId"));
        Page<Guanggao> page = guanggaoService.findAll(pageable);
        List<Guanggao> content =page.getContent();
        for (int i = 0; i <content.size() ; i++) {
            Guanggao guanggao=content.get(i);
            log.info(guanggao.toString());}
    }

    @Test
    public void deleteById() {
        guanggaoService.deleteById("1");
    }

    @Test
    public void save() {
        Guanggao g=new Guanggao();

        g.setGgTitle("明星");
        g.setGgImg("刘亦菲");
        g.setGgUrl("https://pic.sogou.com/d?query=%C1%F5%D2%E0%B7%C6&st=255&mode=255&did=41#did40");
        g.setGgTime(new Date());
        guanggaoService.save(g);
        log.info("[添加一个广告]" + g.toString());
    }

    @Test
    public void saveAll() {
        List<Guanggao> list=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            Guanggao g=new Guanggao();
            g.setGgTitle("明星"+i+"号");
            g.setGgImg("刘亦菲");
            g.setGgUrl("https://pic.sogou.com/d?query=%C1%F5%D2%E0%B7%C6&st=255&mode=255&did=41#did40");
            g.setGgTime(new Date());

            list.add(g);

        }
        guanggaoService.saveAll(list);
        log.info("[添加一个广告]" +list.size());
    }


}