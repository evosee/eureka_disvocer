package com.example.demo.servicebprovider.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("serviceb")
@RequestMapping("/b")
public interface FeignProvider {
    @RequestMapping("/feignProvider")
    String feignProvider();
}
