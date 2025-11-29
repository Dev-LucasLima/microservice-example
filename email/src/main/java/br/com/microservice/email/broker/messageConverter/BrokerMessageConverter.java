package br.com.microservice.email.broker.messageConverter;

import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerMessageConverter {

    MessageConverter createMessageConverter();

}
