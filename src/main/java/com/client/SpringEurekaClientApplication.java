package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //客户端
public class SpringEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientApplication.class, args);
    }
}
