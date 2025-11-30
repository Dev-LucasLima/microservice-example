package br.com.microservice.email.email.sender;

import br.com.microservice.email.model.EmailModel;

public interface SenderEmailService {

    void sendEmail(final EmailModel emailModel);

}
