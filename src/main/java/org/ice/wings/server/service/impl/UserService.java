package org.ice.wings.server.service.impl;

import org.ice.wings.server.domain.IUserRepository;
import org.ice.wings.server.domain.model.UserModel;
import org.ice.wings.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ice
 * @version 1.0
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;


    @Override
    public List<UserModel> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public List<UserModel> getUserListByUsername(String username) {
        return userRepository.getUserListByUsername(username);
    }

    @Override
    public void addUser(String username, String password) {
        UserModel user = new UserModel();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }
}

