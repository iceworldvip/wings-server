package org.ice.wings.server.controller;

import org.ice.wings.server.domain.model.UserModel;
import org.ice.wings.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户操作路由控制器
 *
 * @author ice
 * @version 1.0
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/user/", method = {RequestMethod.GET})
    public UserModel getUser() {
        return new UserModel();
    }

    @RequestMapping(path = "/user/list/", method = {RequestMethod.GET})
    public List<UserModel> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping(path = "/param/path/{username}/", method = {RequestMethod.GET})
    public List<UserModel> getUserListByUsername(@PathVariable String username) {
        return userService.getUserListByUsername(username);
    }

    @RequestMapping(path = "/param/", method = {RequestMethod.GET})
    public String getRequestParam(String username, String password) {
        System.out.println(username + "========" + password);
        userService.addUser(username, password);
        return username + "=========" + password;
    }
}
