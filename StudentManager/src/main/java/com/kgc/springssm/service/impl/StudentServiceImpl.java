package com.kgc.springssm.service.impl;


import com.kgc.springssm.mapper.StudentMapper;
import com.kgc.springssm.pojo.Classes;
import com.kgc.springssm.pojo.Student;
import com.kgc.springssm.pojo.StudentExample;
import com.kgc.springssm.service.ClassesService;
import com.kgc.springssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesService classesService;

    @Override
    public List<Student> selectAllStudent() {
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        List<Student> students = studentMapper.selectByExample(example);
        for (Student student : students) {
            Classes classes = classesService.classes(student.getClassid());
            student.setClassName(classes.getName());
        }
        return students;
    }
    @Override
    public void add(Student student) {
        int i = studentMapper.insert(student);
    }
}
