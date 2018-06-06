package org.jpa;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"org.jpa"}) // simple SpringBoot application
public class Application {
    private static final Logger log = Logger.getLogger("test");


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    

  

}

