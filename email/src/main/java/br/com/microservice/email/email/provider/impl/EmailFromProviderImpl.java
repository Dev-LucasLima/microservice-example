package br.com.microservice.email.email.provider.impl;

import br.com.microservice.email.email.provider.EmailFromProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailFromProviderImpl implements EmailFromProvider {

    @Value("${spring.mail.username}")
    private String emailFromAddress;

    @Override
    public String getEmailFromAddress() {
        return emailFromAddress;
    }
}