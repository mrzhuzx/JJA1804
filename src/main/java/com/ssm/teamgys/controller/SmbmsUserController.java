package com.ssm.teamgys.controller; /*
 *desc:
 *author:程序猿大佬阿松
 *time:2019/3/27 0027
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmsUser;
import com.ssm.teamgys.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/smuser")
public class SmbmsUserController {

    @Autowired
    SmbmsUserService smbmsUserService;

    /**
     * 查询全部数据
      * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/smbmsUser");
        List<SmbmsUser> smbmsUserList=smbmsUserService.findAll();
        m.addObject("smbmsUserList",smbmsUserList);
        return m;

    }
    /**
     * 添加
     */
    @RequestMapping("{user}/adduser")
    public ModelAndView adduser(@PathVariable(value = "user")SmbmsUser su) {
        ModelAndView m=new ModelAndView("jsp/smbmsUser");
        SmbmsUser save = smbmsUserService.save(su);
        if (save!=null){
            List<SmbmsUser> list = smbmsUserService.findAll();
            m.addObject("userlist",list);
            return m;
        }else {
            List<SmbmsUser> list =smbmsUserService.findAll();
            m.addObject("userlist",list);
            return m;
        }

    }
    /**
     * 根据ID删除一条数据
     */
    @RequestMapping("{userid}/deleteById")
    public ModelAndView deleteById(@PathVariable(value = "userid")Long userid){
        ModelAndView m =new ModelAndView("jsp/smbmsUser");
        smbmsUserService.deleteById(String.valueOf(userid));
        List<SmbmsUser> list = smbmsUserService.findAll();
        m.addObject("userlist",list);
        return m;
    }
    /**
     * 根据ID修改数据
     */
    @RequestMapping("{user}/updateById")
    public ModelAndView updateById(@PathVariable(value = "user")SmbmsUser su){
        ModelAndView m = new ModelAndView("jsp/smbmsUser");

        List<SmbmsUser> list = smbmsUserService.findAll();
        m.addObject("userlist",list);
        return m;


    }

}
