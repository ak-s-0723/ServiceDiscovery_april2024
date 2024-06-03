package org.example.servicediscovery_april2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryApril2024Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApril2024Application.class, args);
    }

}
