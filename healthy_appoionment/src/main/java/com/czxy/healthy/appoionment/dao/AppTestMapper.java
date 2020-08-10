package com.czxy.healthy.appoionment.dao;

import com.czxy.healthy.domian.appointment.AppTesting;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppTestMapper extends tk.mybatis.mapper.common.Mapper<AppTesting> {
    @Select("select * from app_testing where id = #{condition} or group_name like #{condition} or mnemonic = #{condition} ")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "groupName",column = "group_name"),
            @Result(property = "mnemonic",column = "mnemonic"),
            @Result(property = "applicableGender",column = "applicable_gender"),
            @Result(property = "applicableAvg",column = "applicable_avg"),
            @Result(property = "price",column = "price"),
            @Result(property = "introduce",column = "introduce")
    })
    List<AppTesting> findAll(@Param("condition") String condition);
}
