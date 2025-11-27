package br.com.microservice.email.configuration.messageConverter;

import org.springframework.amqp.support.converter.MessageConverter;

public interface BrokerMessageConverter {

    MessageConverter createMessageConverter();

}
