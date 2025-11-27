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
public class RabbitMQBrokerConfiguration implements BrokerConfiguration {

    private final QueueProvider queueProvider;
    private final BrokerMessageConverter brokerMessageConverter;

    public RabbitMQBrokerConfiguration(
            @Autowired final QueueProvider queueProvider,
            @Autowired final BrokerMessageConverter brokerMessageConverter) {
        this.queueProvider = queueProvider;
        this.brokerMessageConverter = brokerMessageConverter;
    }

    @Bean
    @Override
    public Queue createBrokerQueue() {
        return new Queue(queueProvider.getQueueName(), true);
    }

    @Bean
    @Override
    public MessageConverter createBrokerMessageConverter() {
        return brokerMessageConverter.createMessageConverter();
    }
}
