package br.com.microservice.email.configuration.broker;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.validation.Valid;

@Configuration
public class RabbitMQBrokkerConfiguration {

    @Value("${broker.queue.email.name}")
    private String queue;
    
    @Bean
    public Queue emailQueue() {
        return new Queue(queue, true);
    }
}
