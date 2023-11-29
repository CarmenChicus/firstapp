package com.springapps.firstapp.beanscopes;


import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {


@Bean
//daca vrem ca bean-ul sa nu fie singleton specificam scope-ul prototype
//@Scope('prototype')
    public Count counter() {
        return new Count(0);
    }
}