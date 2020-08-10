package com.czxy.healthy.domian.member;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户
 */
@Data
@Table(name = "healthy_member")
public class Member {

    @Id
    @Column(name = "id")
    private Integer id; // 会员档案号

    private String userName; // 会员姓名

    private String userGender; // 会员性别

    private Integer userAge; // 年龄

    private String userManager; // 健康管理师

    private String userTelephone; // 手机号

    @DateTimeFormat(pattern = "yyyy-mm-ss")
    private String userRegistrationTime; // 注册时间


}
