package com.alpha.controller;

import com.alpha.feign.BetaClient;
import com.alpha.feign.CharlieClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/alpha")
@RestController
@RequiredArgsConstructor
public class RequestController {
    private final BetaClient betaClient;

    private final CharlieClient charlieClient;

    @GetMapping("")
    public String getAlpha(){
        return "alpha";
    }

    @GetMapping("/get-beta")
    public String getBeta(){
      return  betaClient.getBeta();
    };

    @GetMapping("/get-charlie")
    public String getCharlie(){
        return charlieClient.getCharlie();
    }
}
