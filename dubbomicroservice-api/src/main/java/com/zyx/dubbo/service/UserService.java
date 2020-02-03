package com.zyx.dubbo.service;

import com.zyx.dubbo.model.User;
public interface UserService {
    public User getUser(Long userId) throws InterruptedException;
}
