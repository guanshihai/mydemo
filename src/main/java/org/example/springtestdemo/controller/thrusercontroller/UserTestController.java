package org.example.springtestdemo.controller.thrusercontroller;

import org.example.springtestdemo.entity.thruser.User;
import org.example.springtestdemo.service.impl.thruserserviceimpl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
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


    // 测试接口：POST /user/register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "注册成功";
    }

    @GetMapping("/hello")
    public String hello() {
        return "✅ 测试成功！Spring MVC 正常工作";
    }
}

