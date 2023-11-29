package com.springapps.firstapp.beans;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String address1(){
        return "Str Republicii, 102";
    }
  //  @Bean
    //public String address1(){
     //   return "Str Republicii, 102"
   // }

    @Bean
    public Customer customer(String address) {
        return new Customer("John", address);


    }

}
