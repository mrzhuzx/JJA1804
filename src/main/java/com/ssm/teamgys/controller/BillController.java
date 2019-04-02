package com.ssm.teamgys.controller;

import com.ssm.teamgys.appcomm.enums.SmbmsBillEnum;
import com.ssm.teamgys.domain.SmbmsBill;
import com.ssm.teamgys.service.SmbmsBillService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Timer;

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    SmbmsBillService smbmsBillService;


    @RequestMapping("/listquery")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/billOperation");
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }
    @RequestMapping("/delete")
    public ModelAndView billDelete(@RequestParam Long strId){
        ModelAndView m=new ModelAndView("jsp/billOperation");
        smbmsBillService.deleteById(String.valueOf(strId));
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }
    @RequestMapping("/save")
    public ModelAndView billSave(@ModelAttribute SmbmsBill smbmsBill){

        smbmsBillService.save(smbmsBill);
        ModelAndView m=new ModelAndView("jsp/billOperation");
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }

    @RequestMapping("/update")
    public  ModelAndView billupdate(@RequestParam Long billId ,@RequestParam String billCode,@RequestParam String productId,@RequestParam String productName,@RequestParam String productDesc,@RequestParam Integer productCount,@RequestParam String productUnit,@RequestParam Double totalPrice,@RequestParam Integer isPayment,@RequestParam Long providerId,@RequestParam String proImg,@RequestParam Long addressId){
        System.out.println(isPayment+"3333333333333####################");
        smbmsBillService.update(billId,billCode,productId,productName,productDesc,productCount,productUnit,totalPrice,isPayment,providerId,proImg,addressId);
        ModelAndView m=new ModelAndView("jsp/billOperation");
        System.out.println("11111111"+smbmsBillService.toString());
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }
    @RequestMapping("/queryOne")
    public ModelAndView queryOne(@RequestParam Long billId ){
        ModelAndView m=new ModelAndView("jsp/billupdate");
        SmbmsBill  bill=smbmsBillService.getOne(String.valueOf(billId));
        m.addObject("bl",bill);
        return m;

    }




}
