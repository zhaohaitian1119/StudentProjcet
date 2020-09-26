package com.zht.student.service;

import com.zht.student.pojo.Classes;
import com.zht.student.pojo.Student;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:06
 */
public interface StudentService {
    List<Student> selAll();
    List<Classes> selClassAll();
    int add(Student student);
}
