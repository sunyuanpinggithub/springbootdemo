package com.sunyp.springbootdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date201914
 */
@ControllerAdvice
//异常捕获切面
@RestController
public class ExceptionController {

    @ExceptionHandler(RuntimeException.class)//拦截运行时异常
    public Map<String,Object> returnResult(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg","test");
        return map;
    }
}
