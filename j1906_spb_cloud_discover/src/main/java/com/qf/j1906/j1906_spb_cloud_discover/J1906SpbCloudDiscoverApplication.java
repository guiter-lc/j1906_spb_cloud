package com.qf.j1906.j1906_spb_cloud_discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class J1906SpbCloudDiscoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbCloudDiscoverApplication.class, args);
    }

}
