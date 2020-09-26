package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAllStudent();
    void add(Student student);
}
