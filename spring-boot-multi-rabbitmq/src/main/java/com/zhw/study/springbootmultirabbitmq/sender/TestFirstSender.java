package com.zhw.study.springbootmultirabbitmq.sender;

import com.zhw.study.springbootmultirabbitmq.commons.MessageSender;
import com.zhw.study.springbootmultirabbitmq.commons.MultiRabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2019/3/11
 */
@Component
public class TestFirstSender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(Object msg) {
        firstRabbitTemplate.convertAndSend("rabbitmq1", msg);
    }

    public void rabbitmq1sender() {
        this.send("innerpeacez1");
    }
}
