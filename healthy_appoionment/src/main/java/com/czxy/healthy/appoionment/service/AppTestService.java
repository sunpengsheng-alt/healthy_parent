package com.czxy.healthy.appoionment.service;

import com.czxy.healthy.appoionment.dao.AppTestMapper;
import com.czxy.healthy.domian.appointment.AppTesting;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppTestService {

    @Resource
    private AppTestMapper appTestMapper;

    public PageInfo<AppTesting> findAllAppTest(int page, int size, String condition) {
        // 1 分页
        PageHelper.startPage(page,size);
        // 1.2 定义条件
        List<AppTesting> list = null;
        if (condition != null && !condition.equals("null")) {
            String conditiontemp = "%"+condition+"%";
            list= appTestMapper.findAll(conditiontemp);
        } else {
            list = appTestMapper.selectAll();
        }
        return new PageInfo<>(list);
    }

    public void addAppTest(AppTesting appTest) {
        appTestMapper.insert(appTest);
    }

    public AppTesting findAppTestById(Integer id) {
        return appTestMapper.selectByPrimaryKey(id);
    }

    public void updateAppTest(AppTesting appTest) {
        appTestMapper.updateByPrimaryKeySelective(appTest);
    }

    public void deleteAppTest(String id) {
        appTestMapper.deleteByPrimaryKey(id);
    }
}
