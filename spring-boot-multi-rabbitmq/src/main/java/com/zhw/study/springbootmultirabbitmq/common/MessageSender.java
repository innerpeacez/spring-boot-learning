package com.zhw.study.springbootmultirabbitmq.common;

public interface MessageSender {
    void send(String message);
}
