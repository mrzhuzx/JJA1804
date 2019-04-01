package com.ssm.teamgys.controller;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.SmbmsProvider;
import com.ssm.teamgys.service.SmbmsProviderService;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * time：2019/3/27--15:56
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("provider")
@Log4j2
public class SmbmsProviderController {

    @Autowired
    SmbmsProviderService smbmsProviderService;


    /**
     * 查询全部Provider
     * @return
     */
    @RequestMapping("findAllProvider")//
    public ModelAndView findAllProvider(){
        ModelAndView m = new ModelAndView("jsp/smbmsProvider");
        List<SmbmsProvider> list = smbmsProviderService.findAll();
        m.addObject("prolist",list);
        return m;
    }

    /**
     * 添加一条Provider
     * @return
     */
    @RequestMapping("addProvider")
    public  ModelAndView addProvider(@ModelAttribute SmbmsProvider sp){
        String proCode=MYUUID.getUUID();
        sp.setProCode(proCode);
        ModelAndView m = new ModelAndView("jsp/smbmsProvider");
        SmbmsProvider save = smbmsProviderService.save(sp);
        if (save!=null) {
            List<SmbmsProvider> list = smbmsProviderService.findAll();
            m.addObject("prolist", list);
            return m;
        }else {
            log.info("添加失败！！！");
            List<SmbmsProvider> list = smbmsProviderService.findAll();
            m.addObject("prolist", list);
            return m;
        }

    }

    /**
     * 根据ID删除一条Provider
     * @return
     */
    @RequestMapping("{proid}/deleteById")
    public ModelAndView deleteById(@PathVariable(value = "proid")Long proid){
        ModelAndView m = new ModelAndView("jsp/smbmsProvider");
        smbmsProviderService.deleteById(String.valueOf(proid));
        List<SmbmsProvider> list = smbmsProviderService.findAll();
        m.addObject("prolist",list);
        return m;
    }

    /**
     * 根据ID修改一条Provider
     * @return
     */
    @RequestMapping("{proId}/updateById")
    public ModelAndView updateById(@PathVariable(value = "proId")Long proId,@ModelAttribute SmbmsProvider sp){
        ModelAndView m= new ModelAndView("jsp/smbmsProvider");
        String proCode=MYUUID.getUUID();
        smbmsProviderService.updateProById(proId,proCode,sp.getProName(),sp.getProDesc(),sp.getProContact(),sp.getProPhone(),sp.getProAddress(),sp.getProFax(),new Date());
        List<SmbmsProvider> list = smbmsProviderService.findAll();
        m.addObject("prolist",list);
        return m;
    }
    @RequestMapping("{proId}/findById")
    public  ModelAndView findById(@PathVariable(value = "proId")String proId){
        ModelAndView m = new ModelAndView("jsp/editProvider");
        SmbmsProvider provider = smbmsProviderService.getOne(proId);
        m.addObject("pr",provider);
        return m;
    }



}
