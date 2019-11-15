package com.qf.j1906.j1906_spb_cloud_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动注册中心服务
@EnableEurekaServer
@SpringBootApplication
public class J1906SpbCloudEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbCloudEurekaserverApplication.class, args);
    }

}
