package com.zhw.study.springbootmultirabbitmq;

import com.zhw.study.springbootmultirabbitmq.sender.TestSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMultiRabbitmqApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private TestSender testSender;
    @Autowired
    private TestSender test2Sender;

    @Test
    public void testSender() {
        testSender.send("innerpaecez");
        test2Sender.send("study rabbitmq");

        System.out.println("发完消息啦");
    }
}
