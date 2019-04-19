package com.elena.springcloud.microservice.VO;

import lombok.Data;

@Data
public class UserVO {

    /** 用户id */
    private Integer id;


    /** 用户账号 */
    private String username;

    /** 用户密码 */
    private String password;


    /** 用户个人信息 */
    private UserInfoVO userInfo;

}
