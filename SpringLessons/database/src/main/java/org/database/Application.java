package org.database;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // simple SpringBoot application
public class Application {
    private static final Logger log = Logger.getLogger("test");


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    

  

}

