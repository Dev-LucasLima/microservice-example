package br.com.microservice.email.configuration.queue.impl;

import br.com.microservice.email.configuration.queue.QueueProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "broker.queue.email")
public class QueueProviderImpl implements QueueProvider {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
