package com.elena.springcloud.microservice.feign;

import com.elena.springcloud.microservice.VO.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    public Optional<UserVO> getUserById(@PathVariable Integer id);

}
