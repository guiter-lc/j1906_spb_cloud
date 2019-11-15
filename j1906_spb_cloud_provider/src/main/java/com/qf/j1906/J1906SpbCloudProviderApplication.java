package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class J1906SpbCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbCloudProviderApplication.class, args);
    }

}
