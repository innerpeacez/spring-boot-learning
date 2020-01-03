package top.ipzgo.springbootproperties.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: innerpeacez
 * @date: 2018/8/23 20:42
 * @Description:
 */
@RestController
@RequestMapping("/zhw")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/helloGet")
    public String getMapping(String param) {
        return param;
    }

    @PostMapping("/helloPost")
    public String postMapping(String param) {
        return param;
    }

    @PutMapping("/helloPut")
    public String putMapping(String param) {
        return param;
    }

    @DeleteMapping("helloDelete")
    public String deleteMapping(String param) {
        return param;
    }

}
