package com.zhw.study.springbootmultirabbitmq.common;

public interface MessageConsumer {
    void receive(String message);
}
