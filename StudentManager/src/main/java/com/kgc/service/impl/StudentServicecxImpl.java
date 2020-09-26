package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesServicecx;
import com.kgc.service.StudentServicecx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("studentService")
public class StudentServicecxImpl implements StudentServicecx {
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesServicecx classesServicecx;

    @Override
    public List<Student> selectAll() {
        List<Student> students=studentMapper.selectByExample(null);
        for(Student student:students){
            if(student.getClassid()!=null){
                List<Classes> classes = classesServicecx.selectClass(student.getClassid());
                student.setClassname(classes.get(0).getName());
            }
        }
        return students;
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }
}
