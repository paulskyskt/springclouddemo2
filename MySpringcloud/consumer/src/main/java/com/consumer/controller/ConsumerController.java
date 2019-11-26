package com.consumer.controller;

import com.consumer.client.UserClient;
import com.consumer.client.UserClient2;
import com.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
//@Controller
@RequestMapping("/cf")
public class ConsumerController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private UserClient2 userClient2;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
          return userClient.queryById(id);
//        User user1 = userClient2.queryById(id);
//        System.out.println(user);
//        return user1;
    }

    @RequestMapping("/findPage")
    public List<User> findPage(){
        return userClient.findPage();
    }

    @RequestMapping("/index")
    public String index(){
        return "<a href=\"http://127.0.0.1:8080/hello.html\">首页2</a>";
    }

}
