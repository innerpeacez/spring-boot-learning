package com.zhw.study.springbootredis.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author innerpeacez
 * @since 2019/4/29
 * 仅仅是为了不使用数据库
 */
@Repository
public class UserRepository {

    private static Map users = new HashMap<String, User>();

    {
        users.put("innerpeacez", new User("innerpeacez", 18));
    }

    public User getUser(String username) {
        User user = (User) users.get(username);
        return user;
    }

    public User setUser(String username, User user) {
        users.put(username, user);
        return user;
    }
}
