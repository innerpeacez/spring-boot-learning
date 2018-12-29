package com.zhw.study.springbootrabbitmq.component.util;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author innerpeacez
 * @since 2018/12/28
 * 消息消费者
 */
@Component
/**
 * 监听 hello 队列
 * RabbitMq是注解驱动的
 */
@RabbitListener(queues = "hello")
public class RabbitmqReceiver {

    /**
     * 接受到hello队列中的消息的处理方法
     */
    @RabbitHandler
    public void process(String hello) {
        System.out.printf("Rabbitmq: {}",hello);
    }

}
