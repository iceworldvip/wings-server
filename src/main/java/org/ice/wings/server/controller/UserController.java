package org.ice.wings.server.controller;

import org.ice.wings.server.domain.model.User;
import org.ice.wings.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/user/", method = {RequestMethod.GET})
    public User getUser() {
        return new User();
    }

    @RequestMapping(path = "/user/list/", method = {RequestMethod.GET})
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping(path = "/param/path/{pathParam}/", method = {RequestMethod.GET})
    public String getRequestPathParam(@PathVariable String pathParam) {
        System.out.println(pathParam);
        return pathParam;
    }

    @RequestMapping(path = "/param/", method = {RequestMethod.GET})
    public String getRequestParam(String username, String password) {
        System.out.println(username + "========" + password);
        userService.addUser(username, password);
        return username + "=========" + password;
    }
}
