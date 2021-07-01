package com.chj.demo.controller;

import com.chj.demo.pojo.User;
import com.chj.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    //注入
    @Autowired
    private DemoService demoService;


    @RequestMapping("test.do")
    public String test(){

        return "来看看";
    }

    //查询全部
    @RequestMapping("show.do")
    public List<User> show(){
        return demoService.show();
    }

    //根据id查询
    @RequestMapping("getId.do/{id}")
    public User getId(@PathVariable Integer id){
        System.out.println(id);
        return demoService.getId(id);
    }
}
