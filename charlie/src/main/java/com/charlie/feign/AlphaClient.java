package com.charlie.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "alpha", url="http://localhost:8180")
public interface AlphaClient {
    @GetMapping("/alpha")
    public String getAlpha();
}
