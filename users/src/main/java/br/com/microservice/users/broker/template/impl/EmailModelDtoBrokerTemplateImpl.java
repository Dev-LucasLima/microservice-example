package br.com.microservice.users.broker.template.impl;

import br.com.microservice.users.broker.template.BrokerTemplate;
import br.com.microservice.users.dto.EmailModelDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailModelDtoBrokerTemplateImpl implements BrokerTemplate<EmailModelDto> {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public void convertAndSend(final String brokerExchange, final String brokerRoutingKey, final EmailModelDto message) {
        rabbitTemplate.convertAndSend(brokerExchange, brokerRoutingKey, message);
    }
}
