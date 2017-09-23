package com.xgy.myssh.service;

import com.xgy.myssh.model.User;

import java.util.List;

/**
 * Created by gowild.cn on 2017/7/12.
 */
public interface UserService {
    User getUser(Long id);
    void insertUser(User user);
    void insertUserList(List<User> userList);
    void deleteUser(User user);
    void updateUser(User user);
}