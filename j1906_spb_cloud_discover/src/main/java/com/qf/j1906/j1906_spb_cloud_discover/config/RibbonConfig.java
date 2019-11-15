package com.qf.j1906.j1906_spb_cloud_discover.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced   //负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
