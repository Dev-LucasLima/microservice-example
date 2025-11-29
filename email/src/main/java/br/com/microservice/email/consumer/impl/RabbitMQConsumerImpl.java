package br.com.microservice.email.consumer.impl;

import br.com.microservice.email.broker.queue.QueueProvider;
import br.com.microservice.email.consumer.BrokerConsumer;
import br.com.microservice.email.dto.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerImpl implements BrokerConsumer<EmailRecordDto> {

    @Autowired
    private QueueProvider queueProvider;

    @Override
    @RabbitListener(queues = "#{@queueProvider.getQueueName()}")
    public void receiveMessage(@Payload final EmailRecordDto emailRecordDto) {
        System.out.println("Received email message: " + emailRecordDto.text());
    }

}
