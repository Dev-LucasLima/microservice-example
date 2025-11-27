package br.com.microservice.email.configuration.broker;

import br.com.microservice.email.configuration.queue.QueueNameProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBrokerConfiguration {

    @Autowired
    private QueueNameProvider queueNameProvider;

    @Bean
    public Queue getEmailQueue() {
        return new Queue(queueNameProvider.getName(), true);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter(new ObjectMapper());
    }
}
