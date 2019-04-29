package com.zhw.study.springbootrabbitmq.component.util;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2018/12/28
 * 消息生产者
 */
@Component
public class RabbitmqSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        // 消息内容
        String message = "hello rabbitmq";

        // 发送消息到名为 hello 的队列中
        this.amqpTemplate.convertAndSend("hello", message);
    }
}
