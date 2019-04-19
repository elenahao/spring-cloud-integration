package com.elena.springcloud.microservice.controller;

import com.elena.springcloud.microservice.DTO.UserDTO;
import com.elena.springcloud.microservice.entity.User;
import com.elena.springcloud.microservice.repository.UserRespository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("user")
public class UserProviderController {

    @Autowired
    private UserRespository userRespository;

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        UserDTO userDTO = new UserDTO();
        Optional<User> user = this.userRespository.findById(id);
        if(user.isPresent()){
            BeanUtils.copyProperties(user, userDTO);
        }
        return userDTO;
    }

}