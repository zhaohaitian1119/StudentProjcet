package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.ClassesExample;
import com.kgc.service.ClassesServicecx;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classesService")
public class ClassesServicecxImpl implements ClassesServicecx {
    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Classes> selectClass(Long id) {
        ClassesExample classesExample=new ClassesExample();
        ClassesExample.Criteria criteria = classesExample.createCriteria();
        if(id!=null){
            criteria.andIdEqualTo(id);
        }
        List<Classes> classes = classesMapper.selectByExample(classesExample);
        return classes;
    }

    @Override
    public List<Classes> selectAll() {
        return classesMapper.selectByExample(null);
    }


}
