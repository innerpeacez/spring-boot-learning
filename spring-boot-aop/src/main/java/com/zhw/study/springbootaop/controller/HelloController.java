package com.zhw.study.springbootaop.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author innerpeacez
 * @since 2019/1/7
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello(@RequestParam String name) {
        System.out.println(1/0);
        return "Hello " + name;
    }

}