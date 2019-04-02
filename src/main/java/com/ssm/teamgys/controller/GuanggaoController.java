package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Guanggao;
import com.ssm.teamgys.service.GuanggaoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 查询全部数据
     * @return
     */

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/advert");
        List<Guanggao> guanggaoList = guanggaoService.findAll();
        m.addObject("advertList",guanggaoList);
        return m;
    }

    /**
     * 有
     * 根据ID删除一条数据
     * @param ggId
     * @return
     */

@RequestMapping("/delete")
    public  ModelAndView advertDelete(@RequestParam Long ggId){
       ModelAndView m=new ModelAndView("jsp/advert") ;
      guanggaoService.deleteById(String.valueOf(ggId));
      List<Guanggao>advertList=guanggaoService.findAll();
      m.addObject("advertList",advertList);
        return m;
}

    /**
     * 添加
     * @param guanggao
     * @return
     */
    @RequestMapping("/seve")
    public ModelAndView advertSave(@ModelAttribute Guanggao guanggao){
        guanggaoService.save(guanggao);

    ModelAndView m=new ModelAndView("jsp/advert") ;

    List<Guanggao>advertList=guanggaoService.findAll();

    m.addObject("advertList",advertList);

        return m;
}

    /**
     * 修改
     * @param ggId
     * @param ggTitle
     * @param ggImg
     * @param ggUrl
     * @return
     */
    @RequestMapping("/update")
public  ModelAndView advertupdate(@RequestParam Long ggId,@RequestParam  String ggTitle,@RequestParam String ggImg, @RequestParam String ggUrl){
        guanggaoService.update(ggId,ggTitle,ggImg,ggUrl);
    ModelAndView m=new ModelAndView("jsp/advert") ;
    System.out.println("111"+guanggaoService.toString());
    List<Guanggao>advertList=guanggaoService.findAll();
    m.addObject("advertList",advertList);
    return m;
}

    }




