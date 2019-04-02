package com.ssm.teamgys.appweb;


import com.ssm.teamgys.appcomm.vo.ResultVO;
import com.ssm.teamgys.domain.ProductInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/26 0026
 */
@RestController
@RequestMapping("app/product")
public class Demo01JSONController {


    @RequestMapping("/list")
    public ResultVO list(){
        ResultVO  resultVO=new ResultVO();

        return resultVO;
    }


}
