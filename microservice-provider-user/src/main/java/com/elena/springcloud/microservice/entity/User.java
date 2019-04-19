package com.elena.springcloud.microservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    /** 用户id */
    @Id
    private Integer id;

    /** 账号 */
    private String username;

    /** 密码 */
    private String password;
}
