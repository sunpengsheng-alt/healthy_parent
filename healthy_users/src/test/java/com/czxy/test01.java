package com.czxy;

import com.czxy.healthy.UsersApplication;
import com.czxy.healthy.domian.member.Users;
import com.czxy.healthy.users.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UsersApplication.class)
public class test01 {

    @Resource
    private UserMapper userMapper;

    @Test
    public void main1() {
        Users users = userMapper.selectByPrimaryKey(1);
        System.out.println(users);
    }

}
