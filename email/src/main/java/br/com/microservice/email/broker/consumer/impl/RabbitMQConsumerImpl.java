package br.com.microservice.email.broker.consumer.impl;

import br.com.microservice.email.broker.consumer.BrokerConsumer;
import br.com.microservice.email.broker.queue.QueueProvider;
import br.com.microservice.email.dto.EmailRecordDto;
import br.com.microservice.email.model.EmailModel;
import br.com.microservice.email.service.ManagerEmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerImpl implements BrokerConsumer<EmailRecordDto> {

    @Autowired
    private ManagerEmailService managerEmailService;

    @Autowired
    private QueueProvider queueProvider;

    @Override
    @RabbitListener(queues = "#{@queueProvider.getQueueName()}")
    public void receiveMessage(@Payload final EmailRecordDto emailRecordDto) {
        final EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordDto, emailModel);

        managerEmailService.sendAndSaveEmail(emailModel);
    }

}
