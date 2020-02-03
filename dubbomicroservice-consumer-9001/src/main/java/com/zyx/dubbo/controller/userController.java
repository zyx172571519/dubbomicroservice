package com.zyx.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyx.dubbo.model.User;
import com.zyx.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    /*
    设置是否检查，以及相应超时时间，超时时间默认时间是1秒,version支持多版本服务（*表示使用任意一个版本）,stub表示本地存根，里面填写服务提供者的存根路径
    loadbalance是负载均衡，dubbo默认的算法是随机
     */
    @Reference(check = false,timeout = 4000,version = "*",loadbalance = "roundrobin")
    UserService userService;

    @RequestMapping("/user/get")
    public User getUser(Long userId) throws InterruptedException {
        return userService.getUser(userId);
    }

}
