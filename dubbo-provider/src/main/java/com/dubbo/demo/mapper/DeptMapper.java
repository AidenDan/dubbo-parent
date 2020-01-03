package com.dubbo.demo.mapper;

import com.dubbo.demo.pojo.Dept;
import com.dubbo.demo.pojo.DeptExample;
import java.util.List;

/**
 * @author LIKUS
 */
public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}