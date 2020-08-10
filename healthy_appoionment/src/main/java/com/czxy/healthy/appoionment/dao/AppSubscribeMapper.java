package com.czxy.healthy.appoionment.dao;

import com.czxy.healthy.domian.appointment.AppSubscribe;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AppSubscribeMapper extends Mapper<AppSubscribe> {

    @Select("select * from  app_subscribe where id like #{condition} or subscribe_name like #{condition} or telephone like #{condition}")
    @Results(id = "v1",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "subscribeTime",column = "subscribe_time"),
            @Result(property = "subscribeName",column = "subscribe_name"),
            @Result(property = "telephone",column = "telephone"),
            @Result(property = "subscribeType",column = "subscribe_type"),
            @Result(property = "subscribeStatus",column = "subscribe_status")
    })
    List<AppSubscribe> findAll(@Param("condition") String condition);
}
