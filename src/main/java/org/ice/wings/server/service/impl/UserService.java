package org.ice.wings.server.service.impl;

import org.ice.wings.server.domain.IUserRepository;
import org.ice.wings.server.domain.UserRepository;
import org.ice.wings.server.domain.model.User;
import org.ice.wings.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ice
 * @version 1.0
 */
@Service
public class UserService implements IUserService{

//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private IUserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public void addUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }
}

