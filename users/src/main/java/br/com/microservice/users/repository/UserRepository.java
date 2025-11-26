package br.com.microservice.users.repository;

import br.com.microservice.users.model.UserModel;

public interface UserRepository {

    UserModel saveUser(final UserModel userModel);
}
