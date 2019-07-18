package com.zhw.study.springbootmultirabbitmq.commons;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2019/3/8
 */
@Component
public abstract class MultiRabbitTemplate {

    @Autowired
    @Qualifier(value = "firstRabbitTemplate")
    public AmqpTemplate firstRabbitTemplate;

    @Autowired
    @Qualifier(value = "secondRabbitTemplate")
    public AmqpTemplate secondRabbitTemplate;
}
