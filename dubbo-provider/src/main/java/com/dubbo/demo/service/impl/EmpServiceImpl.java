package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.mapper.EmpMapper;
import com.dubbo.demo.pojo.Emp;
import com.dubbo.demo.pojo.EmpExample;
import com.dubbo.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-25 15:15:27
 */
@Service(version = "1.0.0", timeout = 1000, interfaceClass = EmpService.class)
@Component
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmp() {
        EmpExample empExample = new EmpExample();
        return empMapper.selectByExample(empExample);
    }
}
