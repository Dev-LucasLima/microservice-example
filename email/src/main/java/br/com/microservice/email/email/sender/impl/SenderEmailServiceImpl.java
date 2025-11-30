package br.com.microservice.email.email.sender.impl;

import br.com.microservice.email.email.message.CustomMailMessage;
import br.com.microservice.email.email.provider.EmailFromProvider;
import br.com.microservice.email.email.sender.SenderEmailService;
import br.com.microservice.email.enums.EmailStatus;
import br.com.microservice.email.model.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SenderEmailServiceImpl implements SenderEmailService {

    @Autowired
    private EmailFromProvider emailFromProvider;

    @Autowired
    private CustomMailMessage customMailMessage;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(final EmailModel emailModel) {
        try {
            emailModel.setEmailFrom(emailFromProvider.getEmailFromAddress());
            emailModel.setSentDateEmail(LocalDateTime.now());
            mailSender.send(customMailMessage.createMailMessage(emailModel));

            emailModel.setStatusEmail(EmailStatus.SENT);
        } catch (final MailException mailException) {
            emailModel.setStatusEmail(EmailStatus.FAILED);
        }
    }
}
