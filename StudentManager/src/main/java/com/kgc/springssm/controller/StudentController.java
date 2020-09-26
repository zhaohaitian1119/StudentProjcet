package com.kgc.springssm.controller;

import com.kgc.springssm.pojo.Classes;
import com.kgc.springssm.pojo.Student;
import com.kgc.springssm.service.ClassesService;
import com.kgc.springssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String toindex(Model model){
        List<Student> students = studentService.selectAllStudent();
        model.addAttribute("students",students);
        return "index";
    }
    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<Classes> classes = classesService.selectAllClasses();
        model.addAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(Student student,Model model){
      studentService.add(student);
      return "redirect:/";
    }
}
