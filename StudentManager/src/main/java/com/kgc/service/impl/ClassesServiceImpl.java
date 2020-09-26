package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.service.ClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;

    @Override
    public Classes selectByid(Long id) {
        Classes classes = classesMapper.selectByPrimaryKey(id);
        return classes;
    }

    @Override
    public List<Classes> selectAll() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
