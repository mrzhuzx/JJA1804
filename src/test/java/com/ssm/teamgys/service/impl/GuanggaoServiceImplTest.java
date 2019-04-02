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
        List<Guanggao> m= guanggaoService.findAll();
        for (Guanggao guanggao:m){
            System.out.println(guanggao.toString());
        }
    }
    @Test
    public void update() {
    int rows = guanggaoService.update( 1,"明星","图片","介绍");
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

        g.setGgTitle("刘亦菲");
        g.setGgImg("http://images10.m.china.com.cn/newschina/oss/nimg/20190310/16/img_32eb00e1221573667c4679461ad407cc_600_9999.jpg");
        g.setGgUrl("提到刘亦菲好多人都叫她神仙姐姐或天仙，因为她的美貌硬生生的担起了天仙的称号并且承受住了这么多年的考验，因为真的很清冷仙气逼人的感觉虽然她本人不承认，还有她本人的气质非常棒！独一无二！了她是正脸侧脸都好看连发际线都那么完美！品品这个优越的头骨！同时我觉得她真是天生吃这碗饭的，小龙女外形气质的描述感觉就是为她量身定做的。我觉得，每一个女生看到她都会自惭形愧吧。360度无死角，越剖析越能发现她的美。不是那种经不起推敲的。");
        g.setCreateTime(new Date());
        guanggaoService.save(g);
        log.info("[添加一个广告]" + g.toString());
    }

    @Test
    public void saveAll() {
        List<Guanggao> list=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            Guanggao g=new Guanggao();
            g.setGgTitle("刘亦菲"+i+"号");
            g.setGgImg("http://images10.m.china.com.cn/newschina/oss/nimg/20190310/16/img_32eb00e1221573667c4679461ad407cc_600_9999.jpg");
            g.setGgUrl("提到刘亦菲好多人都叫她神仙姐姐或天仙，因为她的美貌硬生生的担起了天仙的称号并且承受住了这么多年的考验，因为真的很清冷仙气逼人的感觉虽然她本人不承认，还有她本人的气质非常棒！独一无二！了她是正脸侧脸都好看连发际线都那么完美！品品这个优越的头骨！同时我觉得她真是天生吃这碗饭的，小龙女外形气质的描述感觉就是为她量身定做的。我觉得，每一个女生看到她都会自惭形愧吧。360度无死角，越剖析越能发现她的美。不是那种经不起推敲的。");

            g.setCreateTime(new Date());

            list.add(g);

        }
        guanggaoService.saveAll(list);
        log.info("[添加一个广告]" +list.size());
    }


}