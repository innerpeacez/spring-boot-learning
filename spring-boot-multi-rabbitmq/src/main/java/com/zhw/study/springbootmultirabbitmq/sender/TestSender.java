package com.zhw.study.springbootmultirabbitmq.sender;

import com.zhw.study.springbootmultirabbitmq.common.MessageSender;
import com.zhw.study.springbootmultirabbitmq.common.MultiRabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestSender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(String message) {
        super.firstRabbitTemplate.convertAndSend("innerpeacez.queue", message);
    }
}
