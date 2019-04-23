package com.zhw.study.springbootmultirabbitmq.sender;

import com.zhw.study.springbootmultirabbitmq.commons.MessageSender;
import com.zhw.study.springbootmultirabbitmq.commons.MultiRabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author zhaihongwei
 * @since 2019/3/11
 */
@Component
public class TestSecondSender extends MultiRabbitTemplate implements MessageSender {

    @Override
    public void send(Object msg) {
        secondRabbitTemplate.convertAndSend("rabbitmq2", msg);
    }

    public void rabbitmq1sender() {
        this.send("innerpeacez2");
    }
}
