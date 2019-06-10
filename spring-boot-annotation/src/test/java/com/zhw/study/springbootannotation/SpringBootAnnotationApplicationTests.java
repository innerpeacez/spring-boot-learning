package com.zhw.study.springbootannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAnnotationApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private NameRepository nameRepository;

    @Test
    public void test() {
        System.out.println(nameRepository.findAll());
    }
}
