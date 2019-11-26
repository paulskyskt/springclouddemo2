package com.user.service;

import com.user.mapper.UserMapper;
import com.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User queryId(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public List<User> findPage(){
        return userMapper.selectAll();
    }

}
