package com.example.slience.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.slience.dao.OptionsDao;
import com.example.slience.entity.Options;
import com.example.slience.service.OptionsService;
import org.springframework.stereotype.Service;

/**
 * (Options)表服务实现类
 *
 * @author makejava
 * @since 2023-02-17 10:57:11
 */
@Service("optionsService")
public class OptionsServiceImpl extends ServiceImpl<OptionsDao, Options> implements OptionsService {

}

