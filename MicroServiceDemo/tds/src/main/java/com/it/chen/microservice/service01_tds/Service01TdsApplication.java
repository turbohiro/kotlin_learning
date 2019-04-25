package com.it.chen.microservice.service01_tds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Service01TdsApplication {

    public static void main(String[] args) {
        SpringApplication.run
                (Service01TdsApplication.class, args);
    }

}

