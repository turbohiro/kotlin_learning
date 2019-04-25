package com.it.chen.microservice.service01_qiecai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Qc_controller {

    @Value("${MyName}")
    String name;

    @GetMapping("/qc")
    public String qiecai(){

        return name + "切好的土豆丝";
    }
}
