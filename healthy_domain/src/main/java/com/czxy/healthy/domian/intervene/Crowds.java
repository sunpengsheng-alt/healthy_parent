package com.czxy.healthy.domian.intervene;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "crowds")
@Data
public class Crowds {

    @Id
    private Integer id;

    private String name;

    private String sex;

    private Integer avg;

    private String state;

    private String category;

    private String manager;


}
