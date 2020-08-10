package com.czxy.healthy.appoionment.controller;

import com.czxy.healthy.appoionment.service.AppMealService;
import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.appointment.AppMeal;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/appMeal")
public class AppMealController {


    @Resource
    private AppMealService appMealService;

    /**
     * 条件查询 + 分页
     * @return
     */
    @GetMapping("/findAllAppMeal/{page}/{size}/{condition}")
    public BaseResult<PageInfo<AppMeal>> findAllAppMeal(@PathVariable("page") int page, @PathVariable("size") int size, @PathVariable("condition") String condition) {
        PageInfo<AppMeal> allMeal = appMealService.findAllAppMeal(page, size, condition);
        return BaseResult.ok("查询成功",allMeal);
    }

    /**
     * 添加
     * @param appMeal
     * @return
     */
    @PostMapping("/addAppMeal")
    public BaseResult addAppMeal(@RequestBody AppMeal appMeal) {
        appMealService.addAppMeal(appMeal);
        return BaseResult.ok("添加成功");
    }

    /**
     * 查询详情
     * @param id
     * @return
     */
    @GetMapping("/findAppMealById/{id}")
    public BaseResult findAppMealById(@PathVariable("id") Integer id) {
        System.out.println(id);
        AppMeal appMeal = appMealService.findAppMealById(id);
        return BaseResult.ok("查询成功",appMeal);
    }


    /**
     * 修改
     * @param appMeal
     * @return
     */
    @PutMapping("/updateAppMeal")
    public BaseResult updateAppMeal(@RequestBody AppMeal appMeal){
        appMealService.updateAppMeal(appMeal);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/deleteAppMeal/{id}")
    public BaseResult deleteAppMeal(@PathVariable("id") String id){
        appMealService.deleteAppMeal(id);
        return BaseResult.ok("删除成功");
    }

}
