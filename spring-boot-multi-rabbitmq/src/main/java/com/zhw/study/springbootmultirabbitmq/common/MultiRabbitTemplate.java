package com.zhw.study.springbootmultirabbitmq.common;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MultiRabbitTemplate {

    @Autowired
    public AmqpTemplate firstRabbitTemplate;

    @Autowired
    public AmqpTemplate secondRabbitTemplate;
}
