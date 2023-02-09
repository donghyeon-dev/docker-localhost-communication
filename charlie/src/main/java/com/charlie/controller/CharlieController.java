package com.charlie.controller;

import com.charlie.feign.AlphaClient;
import com.charlie.feign.BetaClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/charlie")
@RequiredArgsConstructor
public class CharlieController {

    private final AlphaClient alphaClient;

    private final BetaClient betaClient;

    @GetMapping("")
    public String getCharlie(){
        return "charlie";
    }

    @GetMapping("/get-beta")
    public String getBeta(){
        return betaClient.getBeta();
    }

    @GetMapping("/get-alpha")
    public String getAlpha(){
        return alphaClient.getAlpha();
    }
}
