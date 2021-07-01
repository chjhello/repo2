package com.chj.demo.service.impl;

import com.chj.demo.dao.UserMapper;
import com.chj.demo.pojo.User;
import com.chj.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

    //查询全部
    @Override
    public List<User> show() {
        return userMapper.selectAll();
    }


    @Override
    public User getId(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
