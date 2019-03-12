package com.zhw.study.springbootmultirabbitmq.consumer;

import com.zhw.study.springbootmultirabbitmq.common.MessageConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Slf4j
public class TestConsumer implements MessageConsumer {

    @Override
    @RabbitListener(bindings = @QueueBinding(value = @Queue("innerpeacez.queue"),
            exchange = @Exchange("innerpeacez"),
            key = "innerpeacez.queue"),
            containerFactory = "firstSimpleFactory")
    public void receive(String message) {
        log.info("test 1 message:{}",message);
    }
}
