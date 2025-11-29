package br.com.microservice.email.repository;

import br.com.microservice.email.model.EmailModel;

public interface EmailRepository {

    EmailModel saveEmail(final EmailModel emailModel);

}
