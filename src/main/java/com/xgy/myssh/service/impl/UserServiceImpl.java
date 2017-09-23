package com.xgy.myssh.service.impl;

import com.xgy.myssh.dao.IUserDao;
import com.xgy.myssh.model.User;
import com.xgy.myssh.service.MiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xgy.myssh.service.UserService;

import java.util.List;

/**
 * Created by gowild.cn on 2017/7/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private MiscService miscService;

    @Override
    public User getUser(Long id) {
        miscService.output();
        return userDao.getUser(id);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void insertUserList(List<User> userList) {
        userDao.insertUserList(userList);
    }

    @Override
    public void deleteUser(User user) {
    }

    @Override
    public void updateUser(User user) {
    }
}
