package com.example.openfeignpayments.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


/*
Open Feign needs to know where to find the interfaces defining the contracts
@EnableFeignClient annotation to enable the OpenFeign functionality and tell
Open feign where to search for the client contract
*/

@Configuration
@EnableFeignClients(basePackages = "com.example.openfeignpayments.proxies")
public class ProjectConfig {
}
