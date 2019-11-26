package com.sunyp.springbootdemo.controller;

import com.sunyp.springbootdemo.entity.Student;
import com.sunyp.springbootdemo.mapper.StudentMapper;
import com.sunyp.springbootdemo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @date201923
 */
@RestController
@Transactional
public class StudentController {

    public static final Log log = LogFactory.getLog(StudentController.class);

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    CacheManager cacheManager;

    @Autowired
    @Qualifier("userServiceImpl")
    public UserService userService;

    @Autowired
    @Qualifier("userServiceImpiTwo") //多个子类区分注解
    public UserService userServiceTwo;

    @RequestMapping("/listStudent")
    public String listStudent() {
        List<Student> students = studentMapper.findAll();
        cacheManager.getCache("baseCache").clear();
        return JSONObject.toJSONString(students);
    }

    @RequestMapping("/add")
    public void inserData(){
        userService.inserData();
        userServiceTwo.inserData();
    }

    @RequestMapping("/log")
    @ResponseBody
    public String testLog(String name){
        log.info("test log");
        return "hahahahahhaha";
    }
}
