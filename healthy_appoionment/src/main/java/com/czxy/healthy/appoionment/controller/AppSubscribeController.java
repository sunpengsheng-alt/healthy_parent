package com.czxy.healthy.appoionment.controller;

import com.czxy.healthy.appoionment.service.AppSubscribeService;
import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.appointment.AppSubscribe;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/appSub")
public class AppSubscribeController {

    @Resource
    private AppSubscribeService subscribeService;

    /**
     * 条件查询 + 分页
     * @return
     */
    @GetMapping("/findAllAppSub/{page}/{size}/{condition}")
    public BaseResult<PageInfo<AppSubscribe>> findAllAppSub(@PathVariable("page") int page, @PathVariable("size") int size, @PathVariable("condition") String condition) {
        PageInfo<AppSubscribe> allSub = subscribeService.findAllSub(page, size, condition);
        return BaseResult.ok("查询成功",allSub);
    }

    /**
     * 添加
     * @param appSubscribe
     * @return
     */
    @PostMapping("/addAppSub")
    public BaseResult addAppSub(@RequestBody AppSubscribe appSubscribe) {
        subscribeService.addAppSub(appSubscribe);
        return BaseResult.ok("添加成功");
    }

    /**
     * 查询详情
     * @param id
     * @return
     */
    @GetMapping("/findAppSubById/{id}")
    public BaseResult findAppSubById(@PathVariable("id") Integer id) {
        System.out.println(id);
        AppSubscribe appSub = subscribeService.findAppSubById(id);
        return BaseResult.ok("查询成功",appSub);
    }


    /**
     * 修改
     * @param appSubscribe
     * @return
     */
    @PutMapping("/updateAppSub")
    public BaseResult updateAppSub(@RequestBody AppSubscribe appSubscribe){
        subscribeService.updateAppSub(appSubscribe);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/deleteAppSub/{id}")
    public BaseResult deleteAppSub(@PathVariable("id") String id){
        subscribeService.deleteAppSub(id);
        return BaseResult.ok("删除成功");
    }
}
