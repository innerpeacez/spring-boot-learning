package com.zhw.study.springboot.po;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: zhaihongwei
 * @date: 2018/8/29 13:38
 * @Description:
 */
@ConfigurationProperties("com.innerpeacez")
@PropertySource("classpath:innerpeacezinfo.properties")
@Component
@Data
public class InnerpeacezInfo {
    @Value("${com.innerpeacez.name}")
    private String name;
    @Value("${com.innerpeacez.address}")
    private String address;
    @Value("${com.innerpeacez.age}")
    private int age;
    @Value("${com.innerpeacez.desc}")
    private String desc;
//    @Value("${com.innerpeacez.iscoder}")
//    private String iscoder;
}
