package br.com.microservice.users.broker.brokerMessageConverter;

import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerMessageConverter {

    MessageConverter createMessageConverter();

}
