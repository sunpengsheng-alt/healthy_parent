package com.czxy.healthy.appoionment.controller;

import com.czxy.healthy.appoionment.service.AppTestService;
import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.appointment.AppTesting;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/appTest")
public class AppTestController {

    @Resource
    private AppTestService appTestService;

    /**
     * 条件查询 + 分页
     * @return
     */
    @GetMapping("/findAllAppTest/{page}/{size}/{condition}")
    public BaseResult<PageInfo<AppTesting>> findAllAppMeal(@PathVariable("page") int page, @PathVariable("size") int size, @PathVariable("condition") String condition) {
        PageInfo<AppTesting> allMeal = appTestService.findAllAppTest(page, size, condition);
        return BaseResult.ok("查询成功",allMeal);
    }

    /**
     * 添加
     * @param appTest
     * @return
     */
    @PostMapping("/addAppTest")
    public BaseResult addAppMeal(@RequestBody AppTesting appTest) {
        appTestService.addAppTest(appTest);
        return BaseResult.ok("添加成功");
    }

    /**
     * 查询详情
     * @param id
     * @return
     */
    @GetMapping("/findAppTestById/{id}")
    public BaseResult findAppTestById(@PathVariable("id") Integer id) {
        AppTesting appTest = appTestService.findAppTestById(id);
        return BaseResult.ok("查询成功",appTest);
    }


    /**
     * 修改
     * @param appTest
     * @return
     */
    @PutMapping("/updateAppTest")
    public BaseResult updateAppTest(@RequestBody AppTesting appTest){
        appTestService.updateAppTest(appTest);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/deleteAppTest/{id}")
    public BaseResult deleteAppMeal(@PathVariable("id") String id){
        appTestService.deleteAppTest(id);
        return BaseResult.ok("删除成功");
    }
}
