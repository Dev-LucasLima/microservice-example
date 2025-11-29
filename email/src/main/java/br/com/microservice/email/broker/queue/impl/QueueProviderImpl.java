package br.com.microservice.email.broker.queue.impl;

import br.com.microservice.email.broker.queue.QueueProvider;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("queueProvider")
public class QueueProviderImpl implements QueueProvider {

    @Value("${broker.queue.email.name}")
    private String queueName;

    @Override
    public String getQueueName() {
        return queueName;
    }

    @Override
    public Queue createQueue() {
        return new Queue(queueName, true);
    }
}
