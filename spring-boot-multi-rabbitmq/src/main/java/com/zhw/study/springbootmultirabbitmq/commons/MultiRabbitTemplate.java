package com.zhw.study.springbootmultirabbitmq.commons;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2019/3/8
 */
@Component
public abstract class MultiRabbitTemplate {

    @Autowired
    public AmqpTemplate firstRabbitTemplate;

    @Autowired
    public AmqpTemplate secondRabbitTemplate;
}
