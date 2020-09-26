package com.kgc.controller;

import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AppController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("students", students);
        return "index";
    }

    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/classesSel")
    @ResponseBody
    public List<Classes> classesSel() {
        List<Classes> classes = classesService.selectAll();
        return classes;
    }

    @RequestMapping("/doadd")
    public String doadd(Student student) {
        studentService.add(student);
        return "redirect:/";
    }
}
