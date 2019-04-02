package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.UserInfo;

import com.ssm.teamgys.service.UserInfoService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * desc:
 * author:卢智鹏
 * {time}
 * version:1.2.3
 */
@Log4j2
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView u = new ModelAndView("jsp/userinfo/userinfo");
        List<UserInfo> userInfoList=userInfoService.findAll();
        u.addObject("userInfoList",userInfoList);
        return u;
    }


    @RequestMapping("/userdel")
    public ModelAndView  userinfodelete(@RequestParam Long userId){
       ModelAndView a=new ModelAndView("jsp/userinfo/userinfo");
       userInfoService.deleteById(String.valueOf(userId));
       List<UserInfo> userInfoList=userInfoService.findAll();
       a.addObject("userInfoList",userInfoList);
       return a;
    }

    @RequestMapping("/save")
    public ModelAndView usersave(@ModelAttribute UserInfo ui) {

        ModelAndView u = new ModelAndView("jsp/userinfo/userinfo");
        UserInfo save = userInfoService.save(ui);
        if (save != null) {
            List<UserInfo> userInfoList=userInfoService.findAll();
            u.addObject("userInfoList",userInfoList);
            return u;
        } else {
            log.info("添加失败");
            List<UserInfo> userInfoList=userInfoService.findAll();
            u.addObject("userInfoList",userInfoList);
            return u;

        }


    }

    @RequestMapping("/searchone")
    public ModelAndView userUpdate(@RequestParam String userId){
        ModelAndView u=new ModelAndView("jsp/userinfo/userupdate");
        UserInfo search=userInfoService.getOne(userId);
        u.addObject("search",search);
        return u;

    }

    @RequestMapping("/update")
    public ModelAndView userupdate(@ModelAttribute UserInfo  user) {
        userInfoService.update(user.getUserId(),user.getUserPassword(),user.getUserAddress(),user.getUserPhone(),user.getUserName(),user.getUserCode());
        ModelAndView u=new ModelAndView("jsp/userinfo/userinfo");
        List<UserInfo> userInfoList=userInfoService.findAll();
        u.addObject("userInfoList",userInfoList);
        return u;
        }

}
