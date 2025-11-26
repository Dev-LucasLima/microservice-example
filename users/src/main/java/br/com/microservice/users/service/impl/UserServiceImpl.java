package br.com.microservice.users.service.impl;

import br.com.microservice.users.model.UserModel;
import br.com.microservice.users.repository.UserRepository;
import br.com.microservice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserModel saveUser(final UserModel userModel) {
        return repository.save(userModel);
    }
}
