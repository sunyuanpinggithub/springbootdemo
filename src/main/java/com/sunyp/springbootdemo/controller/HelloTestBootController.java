package com.sunyp.springbootdemo.controller;

import com.sunyp.springbootdemo.StudentProperties;
import com.sunyp.springbootdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date201923
 */
@RestController
//@Controller+每个方法上加ResposeBody注解，定义为resful接口，返回标准的json
public class HelloTestBootController {

    @Autowired
    private StudentProperties studentProperties;

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/hello122")
    public String hello() {
        return studentProperties.getName()+studentProperties.getSex();
    }
}
