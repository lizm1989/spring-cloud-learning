package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerRegisterApplication {

    public static void main(String[] args) {
        // SpringApplication.run(EurekaServerRegisterApplication.class, args);
        new SpringApplicationBuilder(EurekaServerRegisterApplication.class).web(true).run(args);
    }
}
