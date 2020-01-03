package com.dubbo.demo.mapper;

import com.dubbo.demo.pojo.Emp;
import com.dubbo.demo.pojo.EmpExample;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}