package br.com.microservice.users.broker.producer;

public interface BrokerProducer<T> {

    void publishMessage(T message);

}
