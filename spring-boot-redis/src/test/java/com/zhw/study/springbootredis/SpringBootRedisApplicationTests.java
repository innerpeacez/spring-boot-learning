package com.zhw.study.springbootredis;

import com.zhw.study.springbootredis.demo.User;
import com.zhw.study.springbootredis.demo.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserServiceImpl userService;

    @Test
    // 使用 redisTemplate 存取字符串
    public void setAndGet() {
        redisTemplate.opsForValue().set("top.ipzgo.spring.ioc.lookup.test:string", "testValueString");
        Assert.assertEquals("testValueString", redisTemplate.opsForValue().get("top.ipzgo.spring.ioc.lookup.test:string"));
    }

    @Test
    // 使用 redisTemplate 存取对象
    public void setAndGetAUser() {
        User user = new User("innerpeacez", 10);
        redisTemplate.opsForValue().set("top.ipzgo.spring.ioc.lookup.test:Object", user);
        Assert.assertEquals(user.getUsername(), ((User) redisTemplate.opsForValue().get("top.ipzgo.spring.ioc.lookup.test:Object")).getUsername());
    }

    @Test
    //使用Redis缓存对象，getUser只会被调用一次
    public void testCache() {
        User user;
        user = userService.getUser("innerpeacez");
        System.out.println(user);
        User user1 = new User("zhaihongwei", 18);
        userService.setUser("innerpeacez", user1);
        user = userService.getUser("innerpeacez");
        System.out.println(user);
    }

}
