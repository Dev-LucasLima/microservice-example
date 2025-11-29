package br.com.microservice.users.broker.template.impl;

import br.com.microservice.users.broker.template.BrokerTemplate;
import br.com.microservice.users.dto.EmailModelDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class EmailModelDtoBrokerTemplateImpl implements BrokerTemplate<EmailModelDto> {

    private final RabbitTemplate rabbitTemplate;

    public EmailModelDtoBrokerTemplateImpl(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    @Override
    public void convertAndSend(final String brokerExchange, final String brokerRoutingKey, final EmailModelDto message) {
        rabbitTemplate.convertAndSend(brokerExchange, brokerRoutingKey, message);
    }
}
