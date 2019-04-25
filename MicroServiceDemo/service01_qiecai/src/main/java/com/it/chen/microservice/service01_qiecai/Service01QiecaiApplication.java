package com.it.chen.microservice.service01_qiecai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service01QiecaiApplication {

    public static void main(String[] args) {
        SpringApplication.run
                (Service01QiecaiApplication.class, args);
    }

}

