package br.com.jojo.apiemnuvem.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
