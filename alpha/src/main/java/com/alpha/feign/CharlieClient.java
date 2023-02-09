package com.alpha.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="charlie", url="http://localhost:8182")
public interface CharlieClient {

    @GetMapping("/charlie")
    public String getCharlie();
}
