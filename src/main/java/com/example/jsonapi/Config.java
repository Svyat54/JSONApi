package com.example.jsonapi;

import com.example.jsonapi.logic.Converter;
import com.example.jsonapi.logic.IConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    IConverter converter(){
        return new Converter();
    }
}
