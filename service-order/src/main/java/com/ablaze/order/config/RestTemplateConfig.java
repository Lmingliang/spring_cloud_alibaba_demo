package com.ablaze.order.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author seecin
 * @title RestTemplateConfig
 * @date 2024/4/2 15:00
 * @Description
 */
@Component
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced //使RestTemplate请求支持负载均衡
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
