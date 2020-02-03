package com.zyx.dubbo.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long userId;

    private String userName;

    private String userSource;

    public User(Long userId, String userName, String userSource) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.userSource = userSource;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSource='" + userSource + '\'' +
                '}';
    }
}
