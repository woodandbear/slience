package com.example.slience.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.slience.dao.StudentDao;
import com.example.slience.entity.Student;
import com.example.slience.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-02-17 10:31:59
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}

