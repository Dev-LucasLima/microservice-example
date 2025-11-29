package br.com.microservice.users.broker.template;

public interface BrokerTemplate<T> {

    void convertAndSend(final String brokerExchange, final String brokerRoutingKey, final T message);

}
