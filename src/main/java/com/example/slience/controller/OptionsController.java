package com.example.slience.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.slience.entity.Options;
import com.example.slience.service.OptionsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Options)表控制层
 *
 * @author makejava
 * @since 2023-02-17 10:57:11
 */
@RestController
@RequestMapping("/options")
public class OptionsController  {
    /**
     * 服务对象
     */
    @Resource
    private OptionsService optionsService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param options 查询实体
     * @return 所有数据
     */
    @GetMapping("/all")
    public Page<Options> selectAll(Page<Options> page, Options options) {
        return this.optionsService.page(page, new QueryWrapper<>(options));
    }

    @PostMapping ("/all2")
    public List<Options> selectAll2(@RequestBody Options options) {
        return  this.optionsService.list( new QueryWrapper<>(options));
    }

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.optionsService.getById(id));
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param options 实体对象
//     * @return 新增结果
//     */
//    @PostMapping
//    public R insert(@RequestBody Options options) {
//        return success(this.optionsService.save(options));
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param options 实体对象
//     * @return 修改结果
//     */
//    @PutMapping
//    public R update(@RequestBody Options options) {
//        return success(this.optionsService.updateById(options));
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
//        return success(this.optionsService.removeByIds(idList));
//    }
}

