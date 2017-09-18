package com.github.rsq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by yangjunming on 2017/6/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApp.class, args);
    }
}