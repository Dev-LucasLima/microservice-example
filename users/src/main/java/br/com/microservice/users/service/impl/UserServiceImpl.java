package br.com.microservice.users.service.impl;

import br.com.microservice.users.model.UserModel;
import br.com.microservice.users.repository.UserRepositoryJpa;
import br.com.microservice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoryJpa repository;

    @Autowired
    public UserServiceImpl(final UserRepositoryJpa repository) {
        this.repository = repository;
    }

    @Override
    public UserModel saveUser(final UserModel userModel) {
        return repository.save(userModel);
    }
}
