package com.it.chen.microservice.eurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/client")
    public  String client(){
        return "注册者";
    }
}
