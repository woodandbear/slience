package com.example.slience.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.slience.entity.Student;
import com.example.slience.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-02-17 10:31:59
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Autowired
    private StudentService studentService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param student 查询实体
     * @return 所有数据
     */
    @GetMapping("/all")
    public Page<Student> selectAll(Page<Student> page, Student student) {
        Page<Student> page1 = this.studentService.page(page, new QueryWrapper<>(student));
        return page1;
    }

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.studentService.getById(id));
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param student 实体对象
//     * @return 新增结果
//     */
//    @PostMapping
//    public R insert(@RequestBody Student student) {
//        return success(this.studentService.save(student));
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param student 实体对象
//     * @return 修改结果
//     */
//    @PutMapping
//    public R update(@RequestBody Student student) {
//        return success(this.studentService.updateById(student));
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param idList 主键结合
//     * @return 删除结果
//     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.studentService.removeByIds(idList));
//    }
}

