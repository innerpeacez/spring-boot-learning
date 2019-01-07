package com.zhw.study.springbootaop.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello(@RequestParam String name) {
        System.out.println(1/0);
        return "Hello " + name;
    }

}