package com.charlie.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "beta", url = "http://localhost:8081")
public interface BetaClient {
    @GetMapping("/beta")
    public String getBeta();
}
