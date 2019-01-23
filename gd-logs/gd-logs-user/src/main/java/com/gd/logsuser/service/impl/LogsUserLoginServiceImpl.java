package com.gd.logsuser.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gd.logsuser.entity.LogsUserLogin;
import com.gd.logsuser.mapper.LogsUserLoginMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@Service
public class LogsUserLoginServiceImpl extends ServiceImpl<LogsUserLoginMapper, LogsUserLogin> implements IService<LogsUserLogin> {

}