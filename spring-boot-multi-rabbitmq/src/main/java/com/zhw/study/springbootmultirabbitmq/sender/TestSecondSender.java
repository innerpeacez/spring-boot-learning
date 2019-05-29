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
public class TestSecondSender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(Object msg) {
        log.info("rabbitmq2 , msg: {}", msg);
        secondRabbitTemplate.convertAndSend("rabbitmq2", msg);
    }

    public void rabbitmq2sender() {
        this.send("innerpeacez2");
    }
}
