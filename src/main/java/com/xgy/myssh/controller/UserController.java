package com.xgy.myssh.controller;

import com.xgy.myssh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xgy.myssh.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gowild.cn on 2017/7/12.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    public String getUserNameById(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        if (StringUtils.isEmpty(id)) {
            return "";
        }
        User user = userService.getUser(Long.parseLong(id));
        if (null == user) {
            return "";
        }
        model.addAttribute("userName", user.getName());
        return "user";
    }
}
