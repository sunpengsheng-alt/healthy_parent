package com.czxy.healthy.member.controller;


import com.czxy.healthy.common.vo.BaseResult;
import com.czxy.healthy.domian.member.Member;
import com.czxy.healthy.member.service.MemberService;
import com.czxy.healthy.result.UsersResult;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
     * 条件查询 + 分页
     * @return
     */
    @PostMapping("/findAllUser/{num}/{size}")
    public BaseResult<PageInfo<Member>> findAllUser(@PathVariable("num") int page, @PathVariable("size") int size, @RequestBody UsersResult usersResult) {
        PageInfo<Member> members = memberService.findAllMember(page, size, usersResult);
        return BaseResult.ok("查询成功",members);
    }

    /**
     * 添加
     * @param member
     * @return
     */
    @PostMapping("/adduser")
    public BaseResult addUser(@RequestBody Member member) {
        memberService.addUser(member);
        return BaseResult.ok("添加成功");
    }

    /**
     * 查询详情
     * @param id
     * @return
     */
    @GetMapping("/findUserById/{id}")
    public BaseResult findUserById(@PathVariable("id") Integer id) {
        System.out.println(id);
        Member member = memberService.findUserById(id);
        return BaseResult.ok("查询成功",member);
    }


    /**
     * 修改
     * @param member
     * @return
     */
    @PutMapping("/update")
    public BaseResult update(@RequestBody Member member){
        memberService.update(member);
        return BaseResult.ok("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/deleteUser/{id}")
    public BaseResult deleteUser(@PathVariable("id") String id){
        memberService.deleteMember(id);
        return BaseResult.ok("删除成功");
    }
}
