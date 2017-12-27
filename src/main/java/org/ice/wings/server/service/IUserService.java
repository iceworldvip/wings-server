package org.ice.wings.server.service;

import org.ice.wings.server.domain.model.UserModel;

import java.util.List;


/**
 * 用户业务操作接口
 *
 * @author ice
 * @version 1.0
 */
public interface IUserService {

    /**
     * 获取所有用户列表
     *
     * @return 用户模板类列表
     */
    List<UserModel> getUserList();

    List<UserModel> getUserListByUsername(String username);

    /**
     * 添加用户
     *
     * @param username 用户名
     * @param password 用户密码
     */
    void addUser(String username, String password);
}
