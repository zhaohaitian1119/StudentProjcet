package com.kgc.service.impl;

import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesService classesService;

    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectByExample(null);
        for (Student student : students) {
            Classes classes = classesService.selectByid(student.getClassid());
            student.setClassName(classes.getName());
        }
        return students;
    }

    @Override
    public void add(Student student) {
        studentMapper.insert(student);

    }
}
