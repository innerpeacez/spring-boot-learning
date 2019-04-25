package com.zhw.study.springbootmultirabbitmq.config;

import lombok.Data;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

/**
 * @author innerpeacez
 * @since 2019/3/11
 */
@Data
public abstract class AbstractRabbitConfiguration {

    protected String host;
    protected int port;
    protected String username;
    protected String password;

    protected ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }
}
