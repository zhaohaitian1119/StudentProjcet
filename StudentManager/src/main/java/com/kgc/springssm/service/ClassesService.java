package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Classes;

import java.util.List;

public interface ClassesService {
    Classes classes(Integer id);
    List<Classes> selectAllClasses();
}
