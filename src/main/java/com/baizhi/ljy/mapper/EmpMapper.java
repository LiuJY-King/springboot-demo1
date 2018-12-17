package com.baizhi.ljy.mapper;

import com.baizhi.ljy.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmpMapper {
    List<Emp> queryAll();

    void addEmp(@Param("emp") Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer id);
}
