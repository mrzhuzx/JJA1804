package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmsRole;
import com.ssm.teamgys.service.SmbmsRoleService;
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
@RequestMapping("/smbmsrole")
public class SmbmsRoleController {

    @Autowired
    SmbmsRoleService smbmsRoleService;

    @RequestMapping("/list")
    public ModelAndView list(){
       ModelAndView s=new ModelAndView("jsp/smbmsrole/role");
        List<SmbmsRole> smbmsRoleList= smbmsRoleService.findAll();
        s.addObject("smbmsRoleList",smbmsRoleList);
        return s;
    }

    @RequestMapping("/save")
    public ModelAndView smbmrolesave(@ModelAttribute SmbmsRole sm){
        ModelAndView s=new ModelAndView("jsp/smbmsrole/role");
        SmbmsRole save= smbmsRoleService.save(sm);
        if (save != null) {
            List<SmbmsRole> smbmsRoleList = smbmsRoleService.findAll();
            s.addObject("smbmsRoleList", smbmsRoleList);
            return s;
        } else {
            log.info("添加失败");
            List<SmbmsRole> smbmsRoleList = smbmsRoleService.findAll();
            s.addObject("smbmsRoleList", smbmsRoleList);
            return s;

        }

    }

    @RequestMapping("/delete")
    public ModelAndView smbnroleDelete(@RequestParam Long roleId){
        ModelAndView s=new ModelAndView("jsp/smbmsrole/role");
        smbmsRoleService.deleteById(String.valueOf(roleId));
        List<SmbmsRole> smbmsRoleList= smbmsRoleService.findAll();
        s.addObject("smbmsRoleList",smbmsRoleList);
        return s;
    }

    @RequestMapping("/roleone")
    public ModelAndView smbmroleone(@RequestParam String roleId){
        ModelAndView s=new ModelAndView("jsp/smbmsrole/roleupdate");
        SmbmsRole role= smbmsRoleService.getOne(roleId);
        List<SmbmsRole> smbmRoles = smbmsRoleService.findAll();
        s.addObject("role", role);
        return s;
    }

    @RequestMapping("/update")
    public ModelAndView smbmroleone(@ModelAttribute SmbmsRole sm){

        smbmsRoleService.update(sm.getRoleId(),sm.getRoleName(),sm.getRoleDesc(),sm.getRoleStatus(),sm.getRoleCode());
        ModelAndView s=new ModelAndView("jsp/smbmsrole/role");
        List<SmbmsRole> smbmsRoleList = smbmsRoleService.findAll();
        s.addObject("smbmsRoleList", smbmsRoleList);
        return s;

    }


}
