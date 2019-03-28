package com.ssm.teamgys.controller; /*
 *desc:
 *author:wjs
 *time:2019/3/27 0027
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmsUser;
import com.ssm.teamgys.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/smuser")
public class SmbmsUserController {

    @Autowired
    SmbmsUserService smbmsUserService;

    @RequestMapping("/list")
    public ModelAndView list(){

        ModelAndView m=new ModelAndView("jsp/smbmsUser");
        List<SmbmsUser> smbmsUserList=smbmsUserService.findAll();
        m.addObject("smbmsUserList",smbmsUserList);
        return m;

    }

}
