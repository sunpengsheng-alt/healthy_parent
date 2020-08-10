package com.czxy.healthy.member.dao;


import com.czxy.healthy.domian.member.Member;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MemberMapper extends Mapper<Member> {

    @Select("select * from  healthy_member where id like #{condition} or user_name like #{condition} or user_telephone like #{condition} ")
    @Results(id = "v1",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userGender",column = "user_gender"),
            @Result(property = "userAge",column = "user_age"),
            @Result(property = "userManager",column = "user_manager"),
            @Result(property = "userTelephone",column = "user_telephone"),
            @Result(property = "userRegistrationTime",column = "user_registration_time")
    })
    List<Member> findAll(@Param("condition") String condition);
}
