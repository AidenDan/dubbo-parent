package com.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-24 11:48:04
 */
@Controller
public class HelloController {

    @Reference(interfaceClass = HelloService.class, version = "1.0.0", check = false)
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/getHw")
    public String getHw(){
        return helloService.getHw();
    }
}
