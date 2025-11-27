package br.com.microservice.email.configuration.queue;

import org.springframework.amqp.core.Queue;

public interface QueueProvider {

    String getQueueName();

    Queue createQueue();
}
