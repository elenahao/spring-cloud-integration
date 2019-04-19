package com.elena.springcloud.microservice.VO;

import lombok.Data;

@Data
public class UserInfoVO {

    /** 姓名 */
    private String name;

    /** 年龄 */
    private Integer age;

    /** 电话 */
    private String phone;
}
