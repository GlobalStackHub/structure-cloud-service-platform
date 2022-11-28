package com.olympus.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudServiceCenterDomainServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceCenterDomainServiceApplication.class, args);
    }

}
