package br.com.microservice.users.broker.queueProvideName.impl;

import br.com.microservice.users.broker.queueProvideName.QueueNameProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("queueProviderName")
public class QueueNameProviderImpl implements QueueNameProvider {

    @Value("${broker.queue.email.name}")
    private String queueName;

    @Override
    public String getQueueName() {
        return queueName;
    }
}
