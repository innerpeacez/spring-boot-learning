package com.zhw.study.springbootjpa;

import com.zhw.study.springbootjpa.pojo.User;
import com.zhw.study.springbootjpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author innerpeacez
 * @since 2019/1/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackages = "com")
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User(1L,"innerpeacez","coding");
        User save = userRepository.save(user);
        System.out.println(save);
    }

    @Test
    public void testGet() {
        Optional<User> save = userRepository.findById(2L);
        System.out.println(save);
    }

    @Test
    public void testFindOne() {
    }

    @Test
    public void testDelete() {
        userRepository.deleteById(1L);
    }

    @Test
    public void testGetAll() {
        List<User> save = userRepository.findAll();
        System.out.println(save);
    }
}
