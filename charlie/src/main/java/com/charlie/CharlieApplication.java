package com.charlie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CharlieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharlieApplication.class, args);
    }

}
