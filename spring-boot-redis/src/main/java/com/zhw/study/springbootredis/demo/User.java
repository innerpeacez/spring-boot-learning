package com.zhw.study.springbootredis.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author innerpeacez
 * @since 2019/4/29
 */
@Data
@AllArgsConstructor
public class User implements Serializable {

     private String username;
     private Integer age;
}
