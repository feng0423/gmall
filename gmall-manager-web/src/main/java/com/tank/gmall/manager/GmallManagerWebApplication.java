package com.tank.gmall.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tank.gmall.manager.controller")
public class GmallManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallManagerWebApplication.class, args);
    }

}
