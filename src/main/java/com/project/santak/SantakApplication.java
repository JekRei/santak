package com.project.santak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SantakApplication {

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SantakApplication.class, args);
    }

}