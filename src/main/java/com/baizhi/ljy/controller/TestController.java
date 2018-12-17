package com.baizhi.ljy.controller;

import com.baizhi.ljy.entity.City;
import com.baizhi.ljy.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    CityMapper cityMapper;

    @RequestMapping("test1")
    public String test() {
        return "hello springboot";
    }

    @RequestMapping("select")
    public City test2() {
        City city = cityMapper.selectByPrimaryKey((long) 1);
        System.out.print("update!");
        return city;
    }

}
