package org.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication // simple SpringBoot application
@EnableIntegration
@IntegrationComponentScan(basePackages = {"org.integration"})
@ComponentScan(basePackages = {"org.integration"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

