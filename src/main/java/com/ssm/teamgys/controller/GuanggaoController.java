package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Guanggao;
import com.ssm.teamgys.service.GuanggaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author :you
 * time: 2019年3月27日 15:59:29
 */
@Controller
@RequestMapping("/guan")
public class GuanggaoController {
    @Autowired
    GuanggaoService guanggaoService;


    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/guangao");
        List<Guanggao> guanggaoList = guanggaoService.findAll();
        m.addObject("guanggaoList",guanggaoList);
        return m;
    }

}
