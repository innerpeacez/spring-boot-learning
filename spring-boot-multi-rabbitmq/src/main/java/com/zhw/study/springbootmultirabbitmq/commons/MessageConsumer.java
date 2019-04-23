package com.zhw.study.springbootmultirabbitmq.commons;


/**
 * @author zhaihongwei
 * @since 2019/3/8
 */
public interface MessageConsumer {

    void receive(Object obj);
}
