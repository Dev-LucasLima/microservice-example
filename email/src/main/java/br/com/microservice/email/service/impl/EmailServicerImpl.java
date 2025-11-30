package br.com.microservice.email.service.impl;

import br.com.microservice.email.email.sender.SenderEmailService;
import br.com.microservice.email.model.EmailModel;
import br.com.microservice.email.service.EmailServicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServicerImpl implements EmailServicer {

    @Autowired
    private SenderEmailService emailService;

    @Override
    public void sendAndSaveEmail(final EmailModel emailModel) {


    }
}
