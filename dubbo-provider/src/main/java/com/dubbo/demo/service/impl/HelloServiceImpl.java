package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-24 11:30:43
 */
@Service(version = "1.0.0", timeout = 1000, interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHw() {
        return "helloWorld";
    }
}
