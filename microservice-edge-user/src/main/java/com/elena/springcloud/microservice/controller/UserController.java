package com.elena.springcloud.microservice.controller;

import com.elena.springcloud.microservice.VO.UserVO;
import com.elena.springcloud.microservice.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public Optional<UserVO> getUser(@PathVariable Integer id){
        return this.userFeignClient.getUserById(id);
    }
}
