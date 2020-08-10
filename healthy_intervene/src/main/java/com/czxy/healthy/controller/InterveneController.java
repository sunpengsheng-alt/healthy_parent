package com.czxy.healthy.controller;

import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.intervene.Crowds;
import com.czxy.healthy.service.InterveneService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intervene")
public class InterveneController {

    private InterveneService interveneService;


    @GetMapping("/findAllCrowds/{page}/{size}")
    public BaseResult<Crowds> findAllCrowds(@PathVariable("page") int page,@PathVariable("size") int size){
        PageInfo<Crowds> clist = interveneService.findAllCrowds(page,size);
        return BaseResult.ok("查询成功",clist);
    }

    @PostMapping("/addCrowds")
    public BaseResult addCrowds(@RequestBody Crowds crowds){
        interveneService.addCrowds(crowds);
        return BaseResult.ok("添加成功");
    }

    @GetMapping("/findCrowds/{id}")
    public BaseResult findCrowds(@PathVariable("id") Integer id){
        Crowds crowds = interveneService.findCrowds(id);
        return BaseResult.ok("查询成功",crowds);
    }


    @PutMapping("/updateCrowds")
    public BaseResult updateCrowds(@RequestBody Crowds crowds){
        interveneService.updateCrowds(crowds);
        return BaseResult.ok("修改成功");
    }

    @DeleteMapping("/delCrowds/{id}")
    public BaseResult delCrowds(Integer id){
        interveneService.delCrowds(id);
        return BaseResult.ok("删除成功");
    }

}
