package com.kgc.controller;

import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesServicecx;
import com.kgc.service.StudentServicecx;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StuController {
    @Resource
    StudentServicecx studentServicecx;
    @Resource
    ClassesServicecx classesServicecx;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<Student> students = studentServicecx.selectAll();
        model.addAttribute("students",students);
        return "index";
    }

    @RequestMapping("/toAdd")
    public String doAdd(Model model){
        List<Classes> classes = classesServicecx.selectAll();
        model.addAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("/add")
    public String add(Student student){

        studentServicecx.add(student);
        return "redirect:selectAll";
    }


}
