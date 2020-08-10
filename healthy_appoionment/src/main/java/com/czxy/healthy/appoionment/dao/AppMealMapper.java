package com.czxy.healthy.appoionment.dao;

import com.czxy.healthy.domian.appointment.AppMeal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AppMealMapper extends Mapper<AppMeal> {
    @Select("select * from app_meal where meal_name like #{condition} or mnemonic_meal_name like #{condition} or meal_introduce like #{condition}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "mealName",column = "meal_name"),
            @Result(property = "mnemonicMealName",column = "mnemonic_meal_name"),
            @Result(property = "applicableGender",column = "applicable_gender"),
            @Result(property = "applicableAvg",column = "applicable_avg"),
            @Result(property = "mealPrice",column = "meal_price"),
            @Result(property = "mealIntroduce",column = "meal_introduce")
    })
    List<AppMeal> findAll(@Param("condition") String condition);
}
