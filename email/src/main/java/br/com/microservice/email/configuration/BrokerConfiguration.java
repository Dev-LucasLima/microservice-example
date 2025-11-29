package br.com.microservice.email.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerConfiguration {

    Queue createBrokerQueue();

    MessageConverter createBrokerMessageConverter();

}
