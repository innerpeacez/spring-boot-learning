//package com.zhw.study.springbootjpa.web;
//
//import com.zhw.study.springbootjpa.top.ipzgo.mybatisplus.pojo.User;
//import com.zhw.study.springbootjpa.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author innerpeacez
// * @since 2019/1/23
// */
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping
//    public User save(@RequestBody User user) {
//        return userRepository.save(user);
//    }
//}
