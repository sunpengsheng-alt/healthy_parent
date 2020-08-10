package com.czxy.healthy.domian.appointment;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;

/**
 * 预约列表
 */
@Document(collection = "app_subscribe")
@Data
public class AppSubscribe {

    // 档案号
    @Id
    private String id;

    // 预约时间
    private String subscribeTime;

    // 姓名
    private String subscribeName;

    // 手机号码
    private String telephone;

    // 预约类型
    private String subscribeType;

    // 预约状态
    private String subscribeStatus;
}
