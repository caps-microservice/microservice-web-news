package org.caps.microservice.web.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author caps
 */
@SpringBootApplication(scanBasePackages = "org.caps.microservice")
@EnableDiscoveryClient
@EnableFeignClients
public class WebnewsApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebnewsApplication.class,args);
    }
}