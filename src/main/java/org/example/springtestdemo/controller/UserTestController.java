package org.example.springtestdemo.controller;

import org.example.springtestdemo.entity.User;
import org.example.springtestdemo.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system/basic")
public class UserTestController {
    @Autowired
    private UserServiceimpl userService = new UserServiceimpl();

    //@RequiresPermissions("twyhr:base:add")
    @PostMapping("/list")
    @ResponseBody
    public Boolean addSave (User user) {

       return userService.addUser(user);
    }
}

