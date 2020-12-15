package com.shuyun.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.shuyun.springboot.dao")
@SpringBootApplication
public class ShuyunSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuyunSpringbootApplication.class, args);
    }

}
