package com.czxy.healthy.domian.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "healthy_user")
@Data
public class Users {

    @Id
    @Column(name = "id")
    private Integer id;          // 用户id

    private String userName;     // 用户名

    private String userPassword; // 密码

    private String verification; // 验证码


}
