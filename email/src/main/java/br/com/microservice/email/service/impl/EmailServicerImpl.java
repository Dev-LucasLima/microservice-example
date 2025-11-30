package br.com.microservice.email.service.impl;

import br.com.microservice.email.model.EmailModel;
import br.com.microservice.email.service.EmailServicer;
import org.springframework.stereotype.Service;

@Service
public class EmailServicerImpl implements EmailServicer {

    @Override
    public void sendAndSaveEmail(final EmailModel emailModel) {


    }
}
