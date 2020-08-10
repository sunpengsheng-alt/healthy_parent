package com.czxy.healthy.domian.assessment;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 健康评估
 */
@Data
@Table(name = "healthy_psychology")
public class HealthyPsychology {

    // 档案号
    @Id
    private Integer id;

    // 姓名
    private String hpName;

    // 心里测评日期
    private String hpTime;

    // 躯体化
    private String somatization;

    // 强迫症
    private String obsession;

    // 人际关系敏感化
    private String interpersonal;

    // 犹豫
    private String hesitate;

    // 焦虑
    private String anxious;

    // 敌对
    private String hostile;

    // 恐怖
    private String terror;

    // 偏执
    private String paranoia;

    // 精神病例
    private String psychosis;


}
