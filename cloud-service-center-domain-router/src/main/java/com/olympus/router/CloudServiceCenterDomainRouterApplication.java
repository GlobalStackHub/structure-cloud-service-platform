package com.olympus.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudServiceCenterDomainRouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceCenterDomainRouterApplication.class, args);
    }

    @GetMapping("/application/alive/check")
    public String aliveCheck() {
        return "200";
    }

}
