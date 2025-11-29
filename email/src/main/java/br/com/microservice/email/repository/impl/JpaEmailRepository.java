package br.com.microservice.email.repository.impl;

import br.com.microservice.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaEmailRepository extends JpaRepository<EmailModel, UUID> {
}
