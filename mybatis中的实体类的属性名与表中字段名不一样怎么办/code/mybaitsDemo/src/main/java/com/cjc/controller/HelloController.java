package com.cjc.controller;

import com.cjc.entity.User;
import com.cjc.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/19
 * Time: 10:17
 * To change this template use File | Settings | File Templates.
 **/
@Controller
@Slf4j
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> users = userMapper.selectAll();
        log.info(users.toString());
        return users;
    }
}
