package com.elena.springcloud.microservice.mapper;

import com.elena.springcloud.microservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> listUser();

}
