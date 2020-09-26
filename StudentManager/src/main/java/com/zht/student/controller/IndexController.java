package com.zht.student.controller;

import com.zht.student.pojo.Classes;
import com.zht.student.pojo.Student;
import com.zht.student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:06
 */
@Controller
public class IndexController {

    @Resource
    StudentService studentService;

    @RequestMapping("/")
    public String selAll(Model model){
        List<Student> students = studentService.selAll();
        model.addAttribute("student",students);
        return "index";
    }

    @RequestMapping("/add")
    public String toAdd(Model model){
        List<Classes> classes = studentService.selClassAll();
        model.addAttribute("classes",classes);
        return "add";
    }

    @RequestMapping("/doadd")
    public String doAdd(Student student){
        studentService.add(student);
        return "redirect:/";
    }

}
