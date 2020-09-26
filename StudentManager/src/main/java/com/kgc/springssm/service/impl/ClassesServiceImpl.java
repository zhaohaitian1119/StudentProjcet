package com.kgc.springssm.service.impl;

import com.kgc.springssm.mapper.ClassesMapper;
import com.kgc.springssm.pojo.Classes;
import com.kgc.springssm.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService{
    @Resource
    ClassesMapper classesMapper;

    @Override
    public Classes classes(Integer id) {
        Classes classes = classesMapper.selectByPrimaryKey(id);
        return classes;
    }

    @Override
    public List<Classes> selectAllClasses() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
