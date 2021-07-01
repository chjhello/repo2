package com.chj.demo.dao;

import com.chj.demo.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;



@Repository
public interface UserMapper extends Mapper<User> {
}
