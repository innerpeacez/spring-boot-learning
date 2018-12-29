package com.zhw.study.springbootrabbitmq.component.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author innerpeacez
 * @since 2018/12/28
 */
@Configuration
public class RabbitmqConfiguration {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
