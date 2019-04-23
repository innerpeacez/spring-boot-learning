package com.zhw.study.springbootmultirabbitmq.consumer;

import com.zhw.study.springbootmultirabbitmq.commons.MessageConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author zhaihongwei
 * @since 2019/3/11
 */

@Slf4j
public class TestFirstConsumer implements MessageConsumer {

    @Override
    @RabbitListener(bindings = @QueueBinding(value = @Queue("rabbitmq1")
            , exchange = @Exchange("rabbitmq1")
            , key = "rabbitmq1")
            , containerFactory = "firstFactory")
    public void receive(Object obj) {
        log.info("rabbitmq1 , {}", obj);
    }

}
