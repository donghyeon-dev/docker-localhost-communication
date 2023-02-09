package com.beta.controller;

import com.beta.feign.AlphaClient;
import com.beta.feign.CharlieClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beta")
@RequiredArgsConstructor
public class BetaController {

    private final AlphaClient alphaClient;
    private final CharlieClient charlieClient;

    @GetMapping("")
    public String getBeta(){
        return "beta";
    }
    @GetMapping("/get-alpha")
    public String getAlpha(){
        return alphaClient.getAlpha();
    }
    @GetMapping("/get-charlie")
    public String getCharlie(){
        return charlieClient.getCharlie();
    }
}
