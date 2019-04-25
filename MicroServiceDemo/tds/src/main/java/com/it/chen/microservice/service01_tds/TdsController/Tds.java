package com.it.chen.microservice.service01_tds.TdsController;

import com.it.chen.microservice.service01_tds.feign.QcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tds {
    @Autowired
    QcService qcService;

    @GetMapping("/tds")
    public String tds(){
        //1.请切菜师傅切好土豆丝
        String qc = qcService.qc();

        //2.自己的炒菜逻辑

        return qc+",炒好了一盘土豆丝";
    }
}
