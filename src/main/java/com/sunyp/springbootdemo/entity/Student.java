package com.sunyp.springbootdemo.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author
 * @date201923
 */
public class Student {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "nameName")
    private String nameName;
    @JSONField(name = "ageAge")
    private Integer ageAge;
    @JSONField(name = "sexSex")
    private String sexSex;

    /* getter and setter */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nameName;
    }

    public void setName(String name) {
        this.nameName = name;
    }

    public Integer getAge() {
        return ageAge;
    }

    public void setAge(Integer age) {
        this.ageAge = age;
    }

    public String getSex() {
        return sexSex;
    }

    public void setSex(String sex) {
        this.sexSex = sex;
    }
}
