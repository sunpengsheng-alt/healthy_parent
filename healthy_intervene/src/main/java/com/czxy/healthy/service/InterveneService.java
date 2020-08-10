package com.czxy.healthy.service;

import com.czxy.healthy.dao.InterveneMapper;
import com.czxy.healthy.domian.intervene.Crowds;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterveneService {

    private InterveneMapper interveneMapper;


    public PageInfo<Crowds> findAllCrowds(int page,int size) {
        PageHelper.startPage(page,size);
        List<Crowds> clist = interveneMapper.findAllCrowds();
        return new PageInfo<>(clist);
    }

    public void addCrowds(Crowds crowds) {
        interveneMapper.insertSelective(crowds);
    }

    public Crowds findCrowds(Integer id) {
        return interveneMapper.selectByPrimaryKey(id);
    }

    public void updateCrowds(Crowds crowds) {
        interveneMapper.updateByPrimaryKeySelective(crowds);
    }

    public void delCrowds(Integer id) {
        interveneMapper.deleteByPrimaryKey(id);
    }

}
