package com.example.spring5configurationExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-configuration.xml")
public class Spring5ConfigurationExample {

    public static void main(String[] args) {
        SpringApplication.run(Spring5ConfigurationExample.class, args);
    }

}
