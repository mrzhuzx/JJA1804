package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmsAddress;
import com.ssm.teamgys.service.SmbmsAddressService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * time：2019/3/27--15:55
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping(value = "address")
@Log4j2
public class SmbmsAddressController {
    @Autowired
    SmbmsAddressService smbmsAddressService;

    /**
     * 查询全部Address
     *
     * @return
     */
    @RequestMapping(value = "findAllAddress",method = RequestMethod.GET)
    public String findAllAddress(Model model) {
        List<SmbmsAddress> list = smbmsAddressService.findAll();
        model.addAttribute("list",list);
        log.info("1111111:"+list.toString());
        return "jsp/smbmsAddress";
    }

    /**
     * 根据ID去修改Address
     *
     * @return
     */
    @RequestMapping(value = "{addId}/updateById",method = RequestMethod.POST)
    public String updateById(@PathVariable(value = "addId")Long addId,@ModelAttribute SmbmsAddress sm,Model model) {
        log.info("--------------"+sm.toString());

        Integer row = smbmsAddressService.updateAddById(sm.getAddId(), sm.getAddContact(), sm.getAddDesc(), sm.getAddPostCode(), sm.getAddTelPhone(), new Date());
        if (row != 0) {
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "jsp/smbmsAddress";
        } else {
            log.info("修改失败！！");
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "jsp/smbmsAddress";
        }


    }
    @RequestMapping("{addId}/findById")
    public String findById(@PathVariable(value = "addId")String addId,Model model){
        SmbmsAddress smbmsAddress = smbmsAddressService.getOne(addId);

        model.addAttribute("sa",smbmsAddress);
        return "jsp/editAddress";
    }

    /**
     * 根据ID删除address
     *
     * @return
     */
    @RequestMapping("{addId}/deleteById")
    public String deleteById(@PathVariable(value = "addId") String addId,Model model) {
        smbmsAddressService.deleteById(addId);
        List<SmbmsAddress> list = smbmsAddressService.findAll();
        model.addAttribute("list",list);
        return "jsp/smbmsAddress";
    }

    /**
     * 添加一条Address
     *
     * @return
     */
    @RequestMapping(value = "addAddress",method = RequestMethod.POST)
    public String addAddress(@ModelAttribute SmbmsAddress sa, Model model) {

        SmbmsAddress save = smbmsAddressService.save(sa);
        if (save != null) {
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "jsp/smbmsAddress";
        } else {
            log.info("添加失败！！");
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "jsp/smbmsAddress";
        }
    }
    //At the time of initialization,convert the type "String" to type "date"
    /**spirngmvc对时间类型支持*/
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), true));
        // binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd "), true));
    }
}