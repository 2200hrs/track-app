package com.example.coronavirapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaVirAppApplication.class, args);
    }

}
