package com.zhw.study.springboothikaricp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootConfiguration
public class SpringBootHikaricpApplicationTests {

    @Autowired
    private JdbcTemplate primaryJdbcTemplate;
    @Autowired
    private JdbcTemplate secondJdbcTemplate;

    @Before
    public void init() {
        primaryJdbcTemplate.execute("CREATE TABLE test1");
        secondJdbcTemplate.execute("CREATE TABLE test2");
    }

    @Test
    public void test() {
//        primaryJdbcTemplate.update("insert into test1 ")
    }
}

