package com.springapps.firstapp.passwordgenerator;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordConfig {

    public static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";

    public PasswordAlphabet allCharacters(){
        return new PasswordAlphabet(CHARACTERS + NUMBERS);
    }

    public PasswordAlphabet characters(){
        return new PasswordAlphabet(CHARACTERS);
    }

    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder;
    }
}


