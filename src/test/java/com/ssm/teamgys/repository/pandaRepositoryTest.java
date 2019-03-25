package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Panda;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class pandaRepositoryTest {

@Autowired
    PandaRepository pandaRepository;
@Test
    public void testAdd() {
     List<Panda> listo = new ArrayList();
    for (int i = 0; i <5; i++) {
        Panda panda = new Panda();
        panda.setPandaname("白毛兽" + i);
        panda.setPandacolor("白色");
        panda.setPandaweight(80.10);
        panda.setPandaage(5);
        panda.setPandafood("嫩竹子");
        listo.add(panda);
    }
        pandaRepository.saveAll(listo);
        log.info(listo.size());

}
@Test
public void TestDel(){
     pandaRepository.deleteById(3);
}

@Test
    public void  TestSearch(){
    List<Panda> alle = pandaRepository.findAll();
    for(Panda d:alle){
        log.info(d.toString());
    }
}
@Test
public void TestUpdate(){
    int i = pandaRepository.update(7, "黑白");
    if (i==1){
        log.info("修改成功");
    }else {
        log.info("修改失败");
    }
}
@Test
    public void TestUpdateone(){
    int i=pandaRepository.updeteone(5,4,"角龙");
    if (i==1){
        log.info("修改成功");
    }else {
        log.info("修改失败");
    }
}
    @Test
    public void  TestSearchd(){
        //Sort sort = new Sort(Sort.Direction.ASC,"pandaid");
        Integer PageNum=3;
        Integer size=5;
        Pageable rt = new PageRequest(PageNum - 1, size, new Sort(Sort.Direction.ASC,"pandaid"));

        Page<Panda> page=pandaRepository.findAll(rt);
        List<Panda> content = page.getContent();
        for (int i = 0; i <content.size() ; i++) {
            Panda panda = content.get(i);
            log.info(panda.toString());
        }


//        Iterator<Panda> iter=page.iterator();
//        System.out.println(page.getNumber());
//        System.out.println(page.getSize());
//        while (iter.hasNext()){
//            Panda panda=iter.next();
//            log.info(panda.toString());
//        }

    }


}
