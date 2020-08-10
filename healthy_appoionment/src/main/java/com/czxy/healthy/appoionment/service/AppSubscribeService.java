package com.czxy.healthy.appoionment.service;

import com.czxy.healthy.appoionment.dao.AppSubscribeMapper;
import com.czxy.healthy.domian.appointment.AppSubscribe;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AppSubscribeService {

    @Resource
    private AppSubscribeMapper subscribeMapper;


    /**
     * 条件 + 分页
     * @param page
     * @param size
     * @param condition
     * @return
     */
    public PageInfo<AppSubscribe> findAllSub(int page, int size, String condition) {
        // 1 分页
        PageHelper.startPage(page,size);
        // 1.2 定义条件
        List<AppSubscribe> list=null;
        if (condition != null && !condition.equals("null")) {

            String condition1 = "%"+condition+"%";
            list= subscribeMapper.findAll(condition1);
        }else {
            list = subscribeMapper.selectAll();
        }
        return new PageInfo<>(list);
    }

    public void addAppSub(AppSubscribe appSubscribe) {
        subscribeMapper.insert(appSubscribe);
    }

    public AppSubscribe findAppSubById(Integer id) {
        return subscribeMapper.selectByPrimaryKey(id);
    }

    public void updateAppSub(AppSubscribe appSubscribe) {
        subscribeMapper.updateByPrimaryKey(appSubscribe);
    }

    public void deleteAppSub(String id) {
        subscribeMapper.deleteByPrimaryKey(id);
    }
}
