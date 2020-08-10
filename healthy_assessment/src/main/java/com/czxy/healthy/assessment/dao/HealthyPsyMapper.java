package com.czxy.healthy.assessment.dao;

import com.czxy.healthy.domian.assessment.HealthyPsychology;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface HealthyPsyMapper extends Mapper<HealthyPsychology> {

    @Select("select * from healthy_psychology where id like #{condition} or hp_name like #{condition} or hp_time = #{condition} ")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "hpName",column = "hp_name"),
            @Result(property = "hpTime",column = "hp_time"),
            @Result(property = "somatization",column = "somatization"),
            @Result(property = "obsession",column = "obsession"),
            @Result(property = "interpersonal",column = "interpersonal"),
            @Result(property = "hesitate",column = "hesitate"),
            @Result(property = "anxious",column = "anxious"),
            @Result(property = "hostile",column = "hostile"),
            @Result(property = "terror",column = "terror"),
            @Result(property = "paranoia",column = "paranoia"),
            @Result(property = "psychosis",column = "psychosis")
    })
    List<HealthyPsychology> findAll(@Param("condition") String condition);
}
