package com.zhw.study.springbootredis.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author innerpeacez
 * @since 2019/4/29
 */
@Slf4j
@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    /**
     * 第一次获取用户信息时，将用户信息缓存到redis 中
     *
     * @param username
     * @return
     */
    @Cacheable(value = "user", key = "'user_'+#username")
    public User getUser(String username) {
        log.info("获取用户信息 ：{}", username);
        return userRepository.getUser(username);
    }

    /**
     * 修改用户信息时，清空当前用户的缓存，保证数据一致性
     *
     * @param username
     * @param user
     * @return
     */
    @CacheEvict(value = "user", key = "'user_'+#username")
    public User setUser(String username, User user) {
        log.info("修改用户信息 ：{}", username);
        return userRepository.setUser(username, user);
    }
}
