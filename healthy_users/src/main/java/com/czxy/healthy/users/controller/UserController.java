package com.czxy.healthy.users.controller;

import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.user.Users;
import com.czxy.healthy.users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    /**
     * 登录
     * @param users
     * @return
     */
    @PostMapping
    public BaseResult login(@RequestBody Users users){

        return null;
    }
}
