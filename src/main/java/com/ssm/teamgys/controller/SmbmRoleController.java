package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmRole;
import com.ssm.teamgys.service.SmbmRoleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Log4j2
@Controller
@RequestMapping("/smbmrole")
public class SmbmRoleController {

    @Autowired
    SmbmRoleService smbmRoleService;

    @RequestMapping("/list")
    public ModelAndView list(){

       ModelAndView s=new ModelAndView("jsp/smbmrole");
        List<SmbmRole> smbmRoleList=smbmRoleService.findAll();
        s.addObject("smbmRoleList",smbmRoleList);
        return s;
    }

    @RequestMapping("/save")
    public ModelAndView smbmrolesave(@ModelAttribute SmbmRole sm){
        ModelAndView s=new ModelAndView("jsp/smbmrole");
        SmbmRole save= smbmRoleService.save(sm);
        if (save != null) {
            List<SmbmRole> smbmRoles =smbmRoleService.findAll();
            s.addObject("smbmRoles", smbmRoles);
            return s;
        } else {
            log.info("添加失败");
            List<SmbmRole> smbmRoles =smbmRoleService.findAll();
            s.addObject("smbmRoles", smbmRoles);
            return s;

        }

    }


}
