package com.zyx.dubbo.mapper;

import com.zyx.dubbo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUser(Long userId);
}
