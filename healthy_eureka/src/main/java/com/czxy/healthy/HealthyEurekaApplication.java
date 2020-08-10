package com.czxy.healthy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HealthyEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HealthyEurekaApplication.class,args);
    }
}
