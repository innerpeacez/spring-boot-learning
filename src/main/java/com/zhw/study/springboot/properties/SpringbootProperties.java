package com.zhw.study.springboot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: zhaihongwei
 * @date: 2018/8/24 10:55
 * @Description:
 */
@Component
@ConfigurationProperties("com.zhw")
@Data
public class SpringbootProperties {
    private String title;
    private String name;
}
