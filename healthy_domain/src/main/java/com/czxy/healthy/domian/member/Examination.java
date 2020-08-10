package com.czxy.healthy.domian.member;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;

@Table(name = "healthy_examination")
public class Examination {
    @DateTimeFormat(pattern = "yyyy-mm-ss")
    private String time;  // 体检时间

    private String detection;  // 检测套餐

    private String state;  // 报告状态

    private Member member;
}
