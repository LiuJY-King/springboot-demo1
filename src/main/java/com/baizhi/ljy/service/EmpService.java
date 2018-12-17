package com.baizhi.ljy.service;

import com.baizhi.ljy.entity.Emp;

import java.util.List;


public interface EmpService {
    List<Emp> getAll();

    void addEmp(Emp emp);

    void changeEmpMessage(Emp emp);

    void dropEmp(Integer id);
}
