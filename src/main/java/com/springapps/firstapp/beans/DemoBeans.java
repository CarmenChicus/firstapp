package com.springapps.firstapp.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DemoBeans implements CommandLineRunner {

    ApplicationContext applicationContext;

    public DemoBeans(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println(applicationContext.getBean("customer"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBeans.class, args);
    }
}
