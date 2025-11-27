package br.com.microservice.email.configuration.broker.impl;

import br.com.microservice.email.configuration.broker.BrokerConfiguration;
import br.com.microservice.email.configuration.messageConverter.BrokerMessageConverter;
import br.com.microservice.email.configuration.queue.QueueProvider;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBrokerConfigurationImpl implements BrokerConfiguration {
    @Autowired
    private QueueProvider queueProvider;

    @Autowired
    private BrokerMessageConverter brokerMessageConverter;

    @Bean
    @Override
    public Queue createBrokerQueue() {
        return queueProvider.createQueue();
    }

    @Bean
    @Override
    public MessageConverter createBrokerMessageConverter() {
        return brokerMessageConverter.createMessageConverter();
    }
}
