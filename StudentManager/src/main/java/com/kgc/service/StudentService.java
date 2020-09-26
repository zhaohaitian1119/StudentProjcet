package com.kgc.service;

import com.kgc.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    void add(Student student);
}
