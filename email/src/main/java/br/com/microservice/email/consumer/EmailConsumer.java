package br.com.microservice.email.consumer;

import br.com.microservice.email.configuration.queue.QueueProvider;
import br.com.microservice.email.dto.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    private QueueProvider queueProvider;

    @RabbitListener(queues = "#{@queueProvider.getQueueName()}")
    public void receiveEmail(@Payload final EmailRecordDto emailRecordDto) {
        System.out.println("Received email message: " + emailRecordDto.message());
    }

}
