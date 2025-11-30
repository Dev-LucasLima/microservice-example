package br.com.microservice.email.email.message.impl;

import br.com.microservice.email.email.message.CustomMailMessage;
import br.com.microservice.email.model.EmailModel;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class CustomMailMessageImpl implements CustomMailMessage {

    @Override
    public SimpleMailMessage createMailMessage(final EmailModel emailModel) {
        return new SimpleMailMessage() {{
            setFrom(emailModel.getEmailFrom());
            setTo(emailModel.getEmailTo());
            setSubject(emailModel.getSubject());
            setText(emailModel.getText());
        }};
    }
}
