package com.zhw.study.springbootmultirabbitmq.sender;

import com.zhw.study.springbootmultirabbitmq.commons.MessageSender;
import com.zhw.study.springbootmultirabbitmq.commons.MultiRabbitTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2019/3/11
 */
@Component
@Slf4j
public class TestFirstSender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(Object msg) {
        log.info("rabbitmq1 , msg: {}", msg);
        firstRabbitTemplate.convertAndSend("rabbitmq1", msg);
    }

    public void rabbitmq1sender() {
        this.send("innerpeacez1");
    }
}
