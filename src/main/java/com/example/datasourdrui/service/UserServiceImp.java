package com.example.datasourdrui.service;

import com.example.datasourdrui.mapper.UserMapper;
import com.example.datasourdrui.pojo.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
public class UserServiceImp  implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
