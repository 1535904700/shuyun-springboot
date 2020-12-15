package com.shuyun.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
