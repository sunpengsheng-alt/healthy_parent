package com.czxy.healthy.assessment.controller;

import com.czxy.healthy.assessment.service.HealthyPsyService;
import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.assessment.HealthyPsychology;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hpay")
public class HealthyPsyController {
    
    @Resource
    private HealthyPsyService healthyPsyService;


    /**
     * 条件查询 + 分页
     * @return
     */
    @GetMapping("/findAllHPay/{page}/{size}/{condition}")
    public BaseResult<PageInfo<HealthyPsychology>> findAllHPay(@PathVariable("page") int page, @PathVariable("size") int size, @PathVariable("condition") String condition) {
        PageInfo<HealthyPsychology> list = healthyPsyService.findAllHPay(page, size, condition);
        return BaseResult.ok("查询成功",list);
    }

    /**
     * 添加
     * @param psychology
     * @return
     */
    @PostMapping("/addHPay")
    public BaseResult addAppMeal(@RequestBody HealthyPsychology psychology) {
        healthyPsyService.addHPay(psychology);
        return BaseResult.ok("添加成功");
    }

    /**
     * 查询详情
     * @param id
     * @return
     */
    @GetMapping("/findHPayById/{id}")
    public BaseResult findHPayById(@PathVariable("id") Integer id) {
        HealthyPsychology HPay = healthyPsyService.findHPayById(id);
        return BaseResult.ok("查询成功",HPay);
    }


    /**
     * 修改
     * @param psychology
     * @return
     */
    @PutMapping("/updateHPay")
    public BaseResult updateHPay(@RequestBody HealthyPsychology psychology){
        healthyPsyService.updateHPay(psychology);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/deleteHPay/{id}")
    public BaseResult deleteHPay(@PathVariable("id") String id){
        healthyPsyService.deleteHPay(id);
        return BaseResult.ok("删除成功");
    }
}
