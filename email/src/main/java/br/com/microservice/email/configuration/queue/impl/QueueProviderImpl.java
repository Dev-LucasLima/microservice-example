package br.com.microservice.email.configuration.queue.impl;

import br.com.microservice.email.configuration.queue.QueueProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueProviderImpl implements QueueProvider {

    @Value("${broker.queue.email.name}")
    private String queueName;

    @Override
    public String getQueueName() {
        return queueName;
    }
}
