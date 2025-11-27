package br.com.microservice.email.configuration.broker;

import br.com.microservice.email.configuration.messageConverter.BrokerMessageConverter;
import br.com.microservice.email.configuration.queue.QueueNameProvider;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBrokerConfiguration {

    private final QueueNameProvider queueNameProvider;
    private final BrokerMessageConverter brokerMessageConverter;

    public RabbitMQBrokerConfiguration(
            @Autowired final QueueNameProvider queueNameProvider,
            @Autowired final BrokerMessageConverter brokerMessageConverter) {
        this.queueNameProvider = queueNameProvider;
        this.brokerMessageConverter = brokerMessageConverter;
    }

    @Bean
    public Queue getEmailQueue() {
        return new Queue(queueNameProvider.getName(), true);
    }

    @Bean
    public MessageConverter messageConverter() {
        return brokerMessageConverter.createMessageConverter();
    }
}
