package com.happylearning.microservice.limitsservice.controller;

import com.happylearning.microservice.limitsservice.configuration.Configuration;
import com.happylearning.microservice.limitsservice.configuration.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration(){
        System.out.println("Hello");
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}