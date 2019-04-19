package com.elena.springcloud.microserviceedgeuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceEdgeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEdgeUserApplication.class, args);
    }

}
