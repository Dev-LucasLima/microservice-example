package br.com.microservice.users.service.impl;

import br.com.microservice.users.broker.producer.BrokerProducer;
import br.com.microservice.users.model.UserModel;
import br.com.microservice.users.repository.UserRepository;
import br.com.microservice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BrokerProducer<UserModel> brokerProducer;

    @Transactional
    @Override
    public UserModel saveUser(final UserModel userModel) {
        final UserModel responseUserModel = repository.saveUser(userModel);
        if (responseUserModel == null) return responseUserModel;

        notifyNewUserRegistration(responseUserModel);
        return responseUserModel;
    }

    private void notifyNewUserRegistration(final UserModel userModel) {
        brokerProducer.publishMessage(userModel);
    }
}
