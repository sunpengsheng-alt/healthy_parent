package com.czxy.healthy.appoionment.service;

import com.czxy.healthy.appoionment.dao.AppMealMapper;
import com.czxy.healthy.domian.appointment.AppMeal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppMealService {

    @Resource
    private AppMealMapper appMealMapper;


    public PageInfo<AppMeal> findAllAppMeal(int page, int size, String condition) {
        // 1 分页
        PageHelper.startPage(page,size);
        // 1.2 定义条件
        List<AppMeal> list=null;
        if (condition != null && !condition.equals("null")) {
            String conditiontemp = "%"+condition+"%";
            list= appMealMapper.findAll(conditiontemp);
        } else {
            list = appMealMapper.selectAll();
        }
        return new PageInfo<>(list);
    }

    public void addAppMeal(AppMeal appMeal) {
        appMealMapper.insert(appMeal);
    }

    public AppMeal findAppMealById(Integer id) {
        return appMealMapper.selectByPrimaryKey(id);
    }

    public void updateAppMeal(AppMeal appMeal) {
        appMealMapper.updateByPrimaryKey(appMeal);
    }

    public void deleteAppMeal(String id) {
        appMealMapper.deleteByPrimaryKey(id);
    }
}
