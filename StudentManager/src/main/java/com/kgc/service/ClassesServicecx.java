package com.kgc.service;

import com.kgc.pojo.Classes;

import java.util.List;

public interface ClassesServicecx {
    List<Classes> selectClass(Long id);
    List<Classes> selectAll();
}
