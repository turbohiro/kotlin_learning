package com.it.chen.microservice.serviceDcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDcfApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDcfApplication.class, args);
    }

}

