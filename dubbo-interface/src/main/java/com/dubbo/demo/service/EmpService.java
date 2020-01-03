package com.dubbo.demo.service;

import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-25 15:12:45
 */
public interface EmpService {

    /**
     *
     *
     * @description: 查询所有的员工
     * @param null
     * @return:
     * @author: Aiden
     * @time: 2019-12-25 15:14:05
     */

    List<com.dubbo.demo.pojo.Emp> findAllEmp();
}
