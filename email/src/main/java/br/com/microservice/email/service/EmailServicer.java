package br.com.microservice.email.service;

import br.com.microservice.email.model.EmailModel;

public interface EmailServicer {

    void sendAndSaveEmail(EmailModel emailModel);

}
