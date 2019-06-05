package com.zhw.study.springbootautoconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WebConfiguration.class)
public class WebAutoConfiguration {


}
