package com.wh.service;


import com.wh.pojo.User;

public interface UserService {

    public User checkUser(String username, String password);
}
