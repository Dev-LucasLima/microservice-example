package br.com.microservice.users.repository.impl;

import br.com.microservice.users.model.UserModel;
import br.com.microservice.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaUserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa userRepositoryJpa;

    @Autowired
    public JpaUserRepositoryImpl(final UserRepositoryJpa userRepositoryJpa) {
        this.userRepositoryJpa = userRepositoryJpa;
    }

    @Override
    public UserModel saveUser(final UserModel userModel) {
        return userRepositoryJpa.save(userModel);
    }
}
