package com.kgc.service;

import com.kgc.pojo.Classes;

import java.util.List;

public interface ClassesService {
    Classes selectByid(Long id);

    List<Classes> selectAll();
}
