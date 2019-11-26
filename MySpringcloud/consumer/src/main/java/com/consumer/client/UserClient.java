package com.consumer.client;

import com.consumer.FeignConfig;
import com.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "user-service",configuration = FeignConfig.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);

    @RequestMapping("/user/findPage")
    List<User> findPage();
}
