package com.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BetaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetaApplication.class, args);
    }

}
