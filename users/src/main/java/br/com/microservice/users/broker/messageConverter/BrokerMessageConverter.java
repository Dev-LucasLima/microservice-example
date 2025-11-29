package br.com.microservice.users.broker.messageConverter;

import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerMessageConverter {

    MessageConverter createMessageConverter();

}
