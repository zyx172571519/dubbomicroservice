package com.zyx.dubbo.controller;

import com.zyx.dubbo.model.User;
import com.zyx.dubbo.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/user/get")
    public User getUser(Long userId){
        return userService.getUser(userId);
    }



}
