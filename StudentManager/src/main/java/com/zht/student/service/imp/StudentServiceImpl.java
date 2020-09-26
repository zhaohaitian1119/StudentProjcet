package com.zht.student.service.imp;

import com.zht.student.mapper.ClassesMapper;
import com.zht.student.mapper.StudentMapper;
import com.zht.student.pojo.Classes;
import com.zht.student.pojo.Student;
import com.zht.student.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:07
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Resource
    StudentMapper studentMapper;

    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Student> selAll() {
        List<Student> students = studentMapper.selectByExample(null);
        return students;
    }

    @Override
    public List<Classes> selClassAll() {
        List<Classes> classes = classesMapper.selectByExample(null);

        return classes;
    }

    @Override
    public int add(Student student) {


        int i = studentMapper.insertSelective(student);

        return i;
    }
}
