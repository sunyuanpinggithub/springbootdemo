package com.sunyp.springbootdemo.service.impl;

import com.sunyp.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @date201914
 */
@Service
@Transactional //springboot的事务控制
public class UserServiceImpl implements UserService{

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void inserData(){
        jdbcTemplate.update("insert into student VALUES (NULL ,?,?,?);","testNew","女",16);
    }

}
