package br.com.microservice.users.broker.configuration.impl;

import br.com.microservice.users.broker.configuration.BrokerConfiguration;
import br.com.microservice.users.broker.messageConverter.BrokerMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqBrokerConfigurationImpl implements BrokerConfiguration {

    @Autowired
    private BrokerMessageConverter brokerMessageConverter;

    @Override
    @Bean
    public MessageConverter createBrokerMessageConverter() {
        return brokerMessageConverter.createMessageConverter();
    }
}
