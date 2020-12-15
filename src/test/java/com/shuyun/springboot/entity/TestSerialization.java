package com.shuyun.springboot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestSerialization implements Serializable {

    String name = "张三";
    static int age = 18;

    public static int getAge() {
        return age;
    }

    public String toString() {
        return "name = " + this.getName() + ", age = " + age;
    }
}
