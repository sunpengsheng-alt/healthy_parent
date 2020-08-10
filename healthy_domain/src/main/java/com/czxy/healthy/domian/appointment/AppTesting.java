package com.czxy.healthy.domian.appointment;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 检测组合管理
 */
@Data
@Table(name="app_testing")
public class AppTesting {

    @Id
    private Integer id;             // 组合编码

    private String groupName;       // 组合名

    private String mnemonic;        // 助记名

    private String applicableGender;  // 适用性别

    private String applicableAvg;   // 适用年龄

    private Integer price;   // 价格

    private String introduce;  // 组合介绍

}
