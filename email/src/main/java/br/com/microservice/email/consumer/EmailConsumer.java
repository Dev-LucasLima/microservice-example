package br.com.microservice.email.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.microservice.email.dto.EmailRecordDto;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void receiveEmail(@Payload EmailRecordDto emailRecordDto) {
        System.out.println("Received email message: " + emailRecordDto.message());
    }

}
