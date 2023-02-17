package com.example.slience.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Student)表实体类
 *
 * @author makejava
 * @since 2023-02-17 10:31:59
 */
@SuppressWarnings("serial")
public class Student extends Model<Student> {
    //学号
    private String id;
    //姓名
    private String name;
    //班级
    private String classInfo;
    //选项ID
    private Integer optionId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

}

