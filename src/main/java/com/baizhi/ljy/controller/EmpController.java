package com.baizhi.ljy.controller;

import com.baizhi.ljy.entity.Emp;
import com.baizhi.ljy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("emplist")
    public List<Emp> emplist(Model model) {
        List<Emp> list = empService.getAll();
        model.addAttribute("list", list);
        return list;
    }

    @RequestMapping("addEmp")
    public String addEmp(Emp emp) {
        empService.addEmp(emp);
        return "redirect:/emp/emplist.do";
    }

    @RequestMapping("updateEmp")
    public String updateEmp(Emp emp) {
        empService.changeEmpMessage(emp);
        return "redirect:/emp/emplist.do";
    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(Integer id) {
        empService.dropEmp(id);
        return "redirect:/emp/emplist.do";
    }
}
