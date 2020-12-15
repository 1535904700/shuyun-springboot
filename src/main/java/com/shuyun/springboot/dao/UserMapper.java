package com.shuyun.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuyun.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
