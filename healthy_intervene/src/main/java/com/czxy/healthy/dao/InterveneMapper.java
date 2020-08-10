package com.czxy.healthy.dao;


import com.czxy.healthy.domian.intervene.Crowds;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface InterveneMapper extends Mapper<Crowds> {

    @Select("select * from crowds ")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "avg",column = "avg"),
            @Result(property = "state",column = "state"),
            @Result(property = "category",column = "category"),
            @Result(property = "manager",column = "manager")
    })
    List<Crowds> findAllCrowds();
}

