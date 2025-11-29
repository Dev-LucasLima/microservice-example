package br.com.microservice.users.broker.producer.impl;

import br.com.microservice.users.broker.producer.BrokerProducer;
import br.com.microservice.users.broker.queueProvideName.QueueNameProvider;
import br.com.microservice.users.broker.template.BrokerTemplate;
import br.com.microservice.users.dto.EmailModelDto;
import br.com.microservice.users.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailBrokerProducerImpl implements BrokerProducer<UserModel> {


    @Autowired
    private BrokerTemplate<EmailModelDto> brokerTemplate;

    @Autowired
    private QueueNameProvider queueNameProvider;

    @Override
    public void publishMessage(final UserModel message) {
        final EmailModelDto emailModelDto = new EmailModelDto(
                message.getId(),
                message.getEmail(),
                "Welcome to Microservice Users",
                String.format("Hello %s! your user has been created successfully.", message.getName())
        );

        final String BROKER_EXCHANGE_DEFAULT = "";
        brokerTemplate.convertAndSend(BROKER_EXCHANGE_DEFAULT, queueNameProvider.getQueueName(), emailModelDto);
    }
}
