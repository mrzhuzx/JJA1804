package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.UserInfo;
import com.ssm.teamgys.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView u = new ModelAndView("jsp/userinfo");
        List<UserInfo> userInfoList=userInfoService.findAll();
        u.addObject("userInfoList",userInfoList);
        return u;
    }



}
