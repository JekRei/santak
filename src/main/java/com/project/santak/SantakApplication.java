package com.project.santak;

import com.project.santak.controller.ProdutosController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackageClasses=ProdutosController.class)
public class SantakApplication {

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SantakApplication.class, args);
    }

}