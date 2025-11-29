package br.com.microservice.email.broker.consumer;

import org.springframework.messaging.handler.annotation.Payload;

public interface BrokerConsumer<T> {

    void receiveMessage(@Payload T message);

}
