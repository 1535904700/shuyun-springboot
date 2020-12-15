package com.shuyun.springboot.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping("/test/{name}")
    public String test(@PathVariable String name) {
        List<String> list = new ArrayList<>();
        list.add("she gao jian");
        return "hello  " + name;

    }
}

