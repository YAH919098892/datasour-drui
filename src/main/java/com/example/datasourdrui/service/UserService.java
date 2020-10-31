package com.example.datasourdrui.service;

import com.example.datasourdrui.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> selectAll();
}
