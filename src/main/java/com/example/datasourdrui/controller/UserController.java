package com.example.datasourdrui.controller;

import com.example.datasourdrui.mapper.UserMapper;
import com.example.datasourdrui.pojo.User;
import com.example.datasourdrui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
@Autowired
UserMapper userService;
@RequestMapping("/all")
public List<User> an(){

    List<User> users = userService.selectAll();
    for (User user : users) {
        System.out.println(user.toString());

    }
return users;
}


}
