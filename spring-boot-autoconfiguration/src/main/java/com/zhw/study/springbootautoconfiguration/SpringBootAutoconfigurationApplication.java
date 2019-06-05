package com.zhw.study.springbootautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
//@ComponentScan
public class SpringBootAutoconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAutoconfigurationApplication.class, args);
    }
}
