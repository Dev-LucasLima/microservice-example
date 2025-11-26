package br.com.microservice.users.repository;

import br.com.microservice.users.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepositoryJpa extends JpaRepository<UserModel, UUID> {

}
