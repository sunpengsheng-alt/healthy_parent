package com.czxy.healthy.member.service;


import com.czxy.healthy.domian.member.Member;
import com.czxy.healthy.member.dao.MemberMapper;
import com.czxy.healthy.result.UsersResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MemberService {

    @Resource
    private MemberMapper memberMapper;

    public PageInfo<Member> findAllMember(Integer page, Integer size, UsersResult usersResult) {

        // 1 分页
        PageHelper.startPage(page,size);
        // 1.2 定义条件
        List<Member> list=null;
        if (usersResult.getCondition() != null) {
            usersResult.setCondition("%"+usersResult.getCondition()+"%");
             list= memberMapper.findAll(usersResult.getCondition());
        }else {
            list = memberMapper.selectAll();
        }
        return new PageInfo<>(list);
    }

    /**
     * 添加
     * @param member
     */
    public void addUser(Member member) {
        memberMapper.insert(member);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Member findUserById(Integer id) {
        Member member = memberMapper.selectByPrimaryKey(id);
        System.out.println(member);
        return member;
    }

    public void update(Member users) {
        memberMapper.updateByPrimaryKey(users);
    }

    public void deleteMember(String id) {
        memberMapper.deleteByPrimaryKey(id);
    }
}
