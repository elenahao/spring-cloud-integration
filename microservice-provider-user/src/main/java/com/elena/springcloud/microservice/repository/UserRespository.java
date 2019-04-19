package com.elena.springcloud.microservice.repository;

import com.elena.springcloud.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRespository extends JpaRepository<User, Integer> {

    //实际没用上
    User getById(Integer id);

    User getByUsername(String username);

    List<User> findByIdIn(List<Integer> ids);

}
