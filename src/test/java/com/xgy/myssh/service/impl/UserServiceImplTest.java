package com.xgy.myssh.service.impl;

import com.xgy.myssh.model.User;
import com.xgy.myssh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hadoop on 2017/9/22.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml", "classpath*:spring-mvc.xml"})
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUser() throws Exception {
        User user = userService.getUser(new Long(1));
        System.out.println(user.toString());
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setName("刘婷");
        user.setPassword("123456");
//        int count = userService.insertUser(user);
        userService.insertUser(user);
//        System.out.println("count : " + count);
    }

    @Test
    public void insertUserList() throws Exception {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setName("石超熊");
        user1.setPassword("123456");
        userList.add(user1);

        User user2 = new User();
        user2.setName("余静");
        user2.setPassword("123456");
        userList.add(user2);

        userService.insertUserList(userList);

    }
}