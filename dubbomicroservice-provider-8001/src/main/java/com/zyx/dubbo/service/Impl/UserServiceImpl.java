package com.zyx.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyx.dubbo.mapper.UserMapper;
import com.zyx.dubbo.model.User;
import com.zyx.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service(version = "1.0.0")     //该服务的版本
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User getUser(Long userId){
        return userMapper.getUser(userId);
    }
}
