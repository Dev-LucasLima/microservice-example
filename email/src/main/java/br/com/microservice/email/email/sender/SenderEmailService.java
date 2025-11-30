package br.com.microservice.email.email.sender;

import br.com.microservice.email.model.EmailModel;

public interface SenderEmailService {

    EmailModel sendEmail(final EmailModel emailModel);

}
