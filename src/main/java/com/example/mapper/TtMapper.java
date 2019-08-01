package com.example.mapper;

import java.util.List;

import com.example.pojo.Tt;
import com.example.pojo.TtExample;
import org.apache.ibatis.annotations.Param;

public interface TtMapper {
    int countByExample(TtExample example);

    int deleteByExample(TtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tt record);

    int insertSelective(Tt record);

    List<Tt> selectByExample(TtExample example);

    Tt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tt record, @Param("example") TtExample example);

    int updateByExample(@Param("record") Tt record, @Param("example") TtExample example);

    int updateByPrimaryKeySelective(Tt record);

    int updateByPrimaryKey(Tt record);
}