package com.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.pojo.Emp;
import com.dubbo.demo.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-25 15:25:20
 */
@Controller
public class EmpController {

    @Reference(interfaceClass = EmpService.class, version = "1.0.0", check=false)
    EmpService empService;

    @RequestMapping("/getEmp")
    @ResponseBody
    public List<Emp> getAllEmp(){
        return empService.findAllEmp();
    };

}
