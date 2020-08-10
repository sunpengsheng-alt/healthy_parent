package com.czxy.healthy.assessment.service;

import com.czxy.healthy.assessment.dao.HealthyPsyMapper;
import com.czxy.healthy.domian.assessment.HealthyPsychology;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HealthyPsyService {

    @Resource
    private HealthyPsyMapper healthyPsyMapper;


    public PageInfo<HealthyPsychology> findAllHPay(int page, int size, String condition) {
        // 1 分页
        PageHelper.startPage(page,size);
        // 1.2 定义条件
        List<HealthyPsychology> list = null;
        if (condition != null && !condition.equals("null")) {
            String conditiontemp = "%"+condition+"%";
            list= healthyPsyMapper.findAll(conditiontemp);
        } else {
            list = healthyPsyMapper.selectAll();
        }
        return new PageInfo<>(list);
    }

    public void addHPay(HealthyPsychology psychology) {
        healthyPsyMapper.insertSelective(psychology);
    }

    public HealthyPsychology findHPayById(Integer id) {
        return healthyPsyMapper.selectByPrimaryKey(id);
    }

    public void updateHPay(HealthyPsychology psychology) {
        healthyPsyMapper.updateByPrimaryKeySelective(psychology);
    }

    public void deleteHPay(String id) {
        healthyPsyMapper.deleteByPrimaryKey(id);
    }
}
