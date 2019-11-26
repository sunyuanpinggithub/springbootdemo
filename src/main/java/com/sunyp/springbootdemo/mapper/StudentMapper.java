package com.sunyp.springbootdemo.mapper;

import com.sunyp.springbootdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author
 * @date201923
 */
@Mapper
@Component
@CacheConfig(cacheNames = "baseCache")
public interface StudentMapper {

    @Select("SELECT * FROM student")
    @Cacheable
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "nameName", column = "name"),
            @Result(property = "sexSex", column = "sex"),
            @Result(property = "ageAge", column = "age")
    })
    List<Student> findAll();
}
