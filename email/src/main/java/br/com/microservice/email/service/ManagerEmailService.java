package br.com.microservice.email.service;

import br.com.microservice.email.model.EmailModel;

public interface ManagerEmailService {

    void sendAndSaveEmail(EmailModel emailModel);

}
