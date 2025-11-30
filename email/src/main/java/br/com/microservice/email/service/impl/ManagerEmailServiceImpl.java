package br.com.microservice.email.service.impl;

import br.com.microservice.email.email.sender.SenderEmailService;
import br.com.microservice.email.model.EmailModel;
import br.com.microservice.email.repository.EmailRepository;
import br.com.microservice.email.service.ManagerEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManagerEmailServiceImpl implements ManagerEmailService {

    @Autowired
    private SenderEmailService senderEmailService;

    @Autowired
    private EmailRepository emailRepository;

    @Override
    @Transactional
    public void sendAndSaveEmail(final EmailModel emailModel) {
        final EmailModel sentEmailModel = senderEmailService.sendEmail(emailModel);

        emailRepository.saveEmail(sentEmailModel);
    }
}
