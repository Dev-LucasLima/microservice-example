package br.com.microservice.email.email.message;

import br.com.microservice.email.model.EmailModel;
import org.springframework.mail.SimpleMailMessage;

public interface CustomMailMessage {

    SimpleMailMessage createMailMessage(final EmailModel emailModel);

}
