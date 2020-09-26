package com.kgc.service;

import com.kgc.pojo.Student;

import java.util.List;

public interface StudentServicecx {
    List<Student> selectAll();
    int add(Student student);


}
