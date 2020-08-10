package com.czxy.healthy.domian.appointment;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * 套餐设置
 */

@Data
@Document(collection = "app_meal")
public class AppMeal {

    // 套餐编码
    @Id
    private Integer id;

    // 套餐名
    private String mealName;

    // 助记名
    private String mnemonicMealName;

    // 适用性别
    private String applicableGender;

    // 适用年龄
    private String applicableAvg;

    // 套餐价格
    private Integer mealPrice;

    // 套餐介绍
    private String mealIntroduce;

}
