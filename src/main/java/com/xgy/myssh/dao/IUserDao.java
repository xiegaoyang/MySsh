package com.xgy.myssh.dao;

import com.xgy.myssh.model.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by gowild.cn on 2017/7/12.
 */
@MapperScan
public interface IUserDao {
    User getUser(Long id);
    int insertUser(User user);
    int insertUserList(List<User> userList);
    int updateUser(User user);
    int deleteUser(User user);
    int deleteUserList(List<User> userList);
}
