package com.sunyp.springbootdemo.service.impl;

import com.sunyp.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @date201921
 */
@Service
@Transactional
public class UserServiceImpiTwo implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void inserData(){
        jdbcTemplate.update("insert into student VALUES (NULL ,?,?,?);","springboot","女",16);
    }
}
