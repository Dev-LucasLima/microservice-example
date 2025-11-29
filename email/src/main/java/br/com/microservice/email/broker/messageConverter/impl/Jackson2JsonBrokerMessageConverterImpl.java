package br.com.microservice.email.broker.messageConverter.impl;

import br.com.microservice.email.broker.messageConverter.BrokerMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class Jackson2JsonBrokerMessageConverterImpl implements BrokerMessageConverter {

    @Override
    public MessageConverter createMessageConverter() {
        return new Jackson2JsonMessageConverter(new ObjectMapper());
    }
}
