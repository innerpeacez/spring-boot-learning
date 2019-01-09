package com.zhw.study.springbootmockmvc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author innerpeacez
 * @since 2019/1/7
 */
@Data
@AllArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    private String email;
}