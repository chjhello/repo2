package com.chj.demo.service;

import com.chj.demo.pojo.User;

import java.util.List;

public interface DemoService {

    //查询全部
    public List<User> show();

    //根据id查询
    public User getId(Integer id);
}
