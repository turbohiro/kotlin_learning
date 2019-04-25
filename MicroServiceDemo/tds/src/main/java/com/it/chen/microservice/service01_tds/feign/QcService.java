package com.it.chen.microservice.service01_tds.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 代表整个切菜的服务
 */
@FeignClient("eureka-qiecai")
public interface QcService {
    @GetMapping("/qc")
    String qc();

}
