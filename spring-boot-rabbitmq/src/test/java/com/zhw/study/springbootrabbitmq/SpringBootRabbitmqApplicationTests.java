package com.zhw.study.springbootrabbitmq;

import com.zhw.study.springbootrabbitmq.component.util.RabbitmqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRabbitmqApplicationTests {

    @Autowired
    private RabbitmqSender rabbitmqSender;

    @Test
    public void test() {
        rabbitmqSender.send();
    }
}

