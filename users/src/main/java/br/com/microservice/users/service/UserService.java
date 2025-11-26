package br.com.microservice.users.service;

import br.com.microservice.users.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserModel saveUser(UserModel userModel);

}
