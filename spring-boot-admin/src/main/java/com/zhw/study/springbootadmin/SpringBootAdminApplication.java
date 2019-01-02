package com.zhw.study.springbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }

//    @Bean
//    public SecuritySecureConfig securitySecureConfig() {
//        return new SecuritySecureConfig(new AdminServerProperties());
//    }
}

