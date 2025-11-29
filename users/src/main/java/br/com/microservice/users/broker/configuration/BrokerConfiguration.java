package br.com.microservice.users.broker.configuration;

import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerConfiguration {

    MessageConverter createBrokerMessageConverter();

}
