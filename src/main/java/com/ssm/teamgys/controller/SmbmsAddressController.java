package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmsAddress;
import com.ssm.teamgys.service.SmbmsAddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * time：2019/3/27--15:55
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("address")
@Log4j2
public class SmbmsAddressController {
    @Autowired
    SmbmsAddressService smbmsAddressService;

    /**
     * 查询全部Address
     *
     * @return
     */
    @RequestMapping("findAllAddress")
    public String findAllAddress(Model model) {
        List<SmbmsAddress> list = smbmsAddressService.findAll();
        model.addAttribute("list",list);
        return "";
    }

    /**
     * 根据ID去修改Address
     *
     * @return
     */
    @RequestMapping("{addrsee}/updateById")
    public String updateById(@PathVariable(value = "addrsee") SmbmsAddress sm,Model model) {

        Integer row = smbmsAddressService.updateAddById(sm.getAddId(), sm.getAddContact(), sm.getAddDesc(), sm.getAddPostCode(), sm.getAddTelPhone(), new Date());
        if (row != 0) {
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "";
        } else {
            log.info("修改失败！！");
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "";
        }


    }

    /**
     * 根据ID删除address
     *
     * @return
     */
    @RequestMapping("{addId}/deleteById")
    public String deleteById(@PathVariable(value = "addId") Long addId,Model model) {
        smbmsAddressService.deleteById(String.valueOf(addId));
        List<SmbmsAddress> list = smbmsAddressService.findAll();
        model.addAttribute("list",list);
        return "";
    }

    /**
     * 添加一条Address
     *
     * @return
     */
    @RequestMapping("{addrsee}/addAddress")
    public String addAddress(@PathVariable(value = "addrsee") SmbmsAddress sa, Model model) {

        SmbmsAddress save = smbmsAddressService.save(sa);
        if (save != null) {
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "";
        } else {
            log.info("添加失败！！");
            List<SmbmsAddress> list = smbmsAddressService.findAll();
            model.addAttribute("list",list);
            return "";
        }
    }
}