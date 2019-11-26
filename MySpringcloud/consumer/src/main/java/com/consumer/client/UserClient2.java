package com.consumer.client;

import com.consumer.FeignConfig;
import com.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service2",configuration = FeignConfig.class)
public interface UserClient2 {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);
}
