package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Team;
import com.ssm.teamgys.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\3\27 0027
 * version:
 */
@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ModelAndView teamDelete(@RequestParam  String  teamId){
        ModelAndView m = new ModelAndView("jsp/team");
        teamService.deleteById(teamId);
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }



    /**
     * 用户添加
     * @param team
     * @return
     */
    @RequestMapping("/save")
    public ModelAndView teamSave(Team team){
        teamService.save(team);
        ModelAndView m = new ModelAndView("jsp/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
/**
 * 用户查找
 */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m = new ModelAndView("jsp/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
    @RequestMapping("/update")
    public ModelAndView teamUpdate(@RequestParam Long teamId,@RequestParam String teamName,@RequestParam String teamSlogen,@RequestParam String teamIcon,@RequestParam String teamState,@RequestParam String teamDesc){
        System.out.println("进来了");
        teamService.update(teamId,teamName,teamSlogen,teamIcon,teamState,teamDesc);
        ModelAndView m = new ModelAndView("jsp/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
    @RequestMapping ("queryone")
    public ModelAndView queryOne(@RequestParam Long teamId){
        ModelAndView m = new ModelAndView("jsp/teamUpdate");
        Team one = teamService.getOne(String.valueOf(teamId));
        m.addObject(one);
        return m;
    }





}
