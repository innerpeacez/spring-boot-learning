package com.zhw.study.springbootmultirabbitmq.sender;

import com.zhw.study.springbootmultirabbitmq.common.MessageSender;
import com.zhw.study.springbootmultirabbitmq.common.MultiRabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2Sender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(String message) {
        super.firstRabbitTemplate.convertAndSend("innerpeacez.queue",message);
    }
}
