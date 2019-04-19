package com.elena.springcloud.microservice.DTO;

import lombok.Data;

import javax.persistence.Id;

@Data
public class UserDTO {

    /** 用户id */
    @Id
    private Integer id;

    /** 账号 */
    private String username;

    /** 密码 */
    private String password;

}
