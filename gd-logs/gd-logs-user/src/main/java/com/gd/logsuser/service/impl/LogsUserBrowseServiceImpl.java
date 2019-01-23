package com.gd.logsuser.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gd.logsuser.mapper.UserMapper;
import com.gd.logsuser.entity.LogsUserBrowse;
import com.gd.logsuser.mapper.LogsUserBrowseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@Service
public class LogsUserBrowseServiceImpl extends ServiceImpl<LogsUserBrowseMapper, LogsUserBrowse> implements IService<LogsUserBrowse> {

    @Resource
    private UserMapper userMapper;
}
