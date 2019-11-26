package com.user.controller;

import com.user.pojo.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${test.name}")
    private String name;

    @GetMapping("/{id}")
    public User queryId(@PathVariable Long id){
        System.out.println(name);
        return userService.queryId(id);
    }
    @RequestMapping("/findPage")
    public List<User> findPage(){
        System.out.println(2);
        return userService.findPage();
    }
}
