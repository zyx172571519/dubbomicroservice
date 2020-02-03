package com.zyx.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyx.dubbo.mapper.UserMapper;
import com.zyx.dubbo.model.User;
import com.zyx.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


@Service(version = "3.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User getUser(Long userId) {
        return userMapper.getUser(userId);
    }
}
