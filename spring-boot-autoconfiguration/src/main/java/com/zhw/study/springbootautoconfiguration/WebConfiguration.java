package com.zhw.study.springbootautoconfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public HelloController HelloController() {
        return new HelloController();
    }

    @Bean
    public ApplicationRunner runner(BeanFactory beanFactory) {
        return args -> {
            System.out.println("当前 HelloController Bean 实现类为："
                    + beanFactory.getBean("HelloController").getClass().getName());

            System.out.println("当前 WebConfiguration Bean 实现类为："
                    + beanFactory.getBean(WebConfiguration.class).getClass().getName());
        };
    }
}
