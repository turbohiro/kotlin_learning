package com.it.chen.microservice.serviceDcf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dcfController {
    @GetMapping("/dcf")
    public String dcf(){
        return "蛋炒饭弄好了";
    }

}
