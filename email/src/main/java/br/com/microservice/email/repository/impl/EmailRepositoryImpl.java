package br.com.microservice.email.repository.impl;

import br.com.microservice.email.model.EmailModel;
import br.com.microservice.email.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailRepositoryImpl implements EmailRepository {

    @Autowired
    private JpaEmailRepository jpaEmailRepository;

    @Override
    public EmailModel saveEmail(EmailModel emailModel) {
        return jpaEmailRepository.save(emailModel);
    }
}
