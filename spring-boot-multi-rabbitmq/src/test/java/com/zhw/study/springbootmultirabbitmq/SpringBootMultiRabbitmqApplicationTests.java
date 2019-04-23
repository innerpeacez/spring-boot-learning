package com.zhw.study.springbootmultirabbitmq;

import com.zhw.study.springbootmultirabbitmq.commons.MultiRabbitTemplate;
import com.zhw.study.springbootmultirabbitmq.sender.TestFirstSender;
import com.zhw.study.springbootmultirabbitmq.sender.TestSecondSender;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootMultiRabbitmqApplicationTests extends MultiRabbitTemplate {

    @Autowired
    private TestFirstSender firstSender;
    @Autowired
    private TestSecondSender secondSender;

    @Test
    public void testFirstSender() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        integers.parallelStream().forEach(
                (l) -> firstSender.send("innerpaecez1")
        );
    }

    @Test
    public void testSecondSender() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        integers.parallelStream().forEach(
                (l) -> secondSender.send("innerpaecez2")
        );
    }
}
