package br.com.microservice.users.service;

import br.com.microservice.users.model.UserModel;

public interface UserService {

    UserModel saveUser(UserModel userModel);

}
