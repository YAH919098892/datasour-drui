package com.example.datasourdrui.mapper;

import com.example.datasourdrui.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface UserMapper {
    List <User> selectAll();
}
