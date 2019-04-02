package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.Team;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\3\26 0026
 * version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TeamServiceImplTest {
    @Autowired
    TeamServiceImpl teamService;

    /**
     * 单个添加
     */
    @Test
    public void testAdd() {
        Team t = new Team();
        t.setTeamDesc("开发者");
        t.setTeamIcon("五号开发者");
        t.setTeamName("熊十");
        t.setTeamSlogen("面向阳光");
        t.setTeamState("在职");
        teamService.save(t);
    }

    /**
     * 批量添加
     */
    @Test

    public void test() {
        List<Team> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Team t = new Team();
            t.setTeamDesc("开发者");
            t.setTeamIcon("五号开发者");
            t.setTeamName("熊十" + i);
            t.setTeamSlogen("面向阳光");
            t.setTeamState("在职");
            list.add(t);

        }
        teamService.saveAll(list);
    }

    /**
     * 查询所有
     */
    @Test
    public void testSearch() {
        List<Team> teamList = teamService.findAll();
        for (Team team : teamList
        ) {
            log.info(team.toString());

        }
    }

    /**
     * 删除一个
     */
    @Test
    public void testDel() {
        teamService.deleteById("5");
    }



    }




