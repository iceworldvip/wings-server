package org.ice.wings.server.service;

import org.ice.wings.server.domain.model.User;

import java.util.List;

public interface IUserService {

    List<User> getUserList();

    void addUser(String username, String password);
}
