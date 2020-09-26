package com.kgc.springssm.mapper;

import com.kgc.springssm.pojo.Classes;
import com.kgc.springssm.pojo.ClassesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ClassesMapper {
    int countByExample(ClassesExample example);

    int deleteByExample(ClassesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    List<Classes> selectByExample(ClassesExample example);

    Classes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}