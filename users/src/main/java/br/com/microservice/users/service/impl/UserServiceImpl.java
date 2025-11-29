package br.com.microservice.users.service.impl;

import br.com.microservice.users.broker.producer.BrokerProducer;
import br.com.microservice.users.model.UserModel;
import br.com.microservice.users.repository.UserRepository;
import br.com.microservice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BrokerProducer<UserModel> brokerProducer;

    @Override
    public UserModel saveUser(final UserModel userModel) {
        return repository.saveUser(userModel);
    }
}
