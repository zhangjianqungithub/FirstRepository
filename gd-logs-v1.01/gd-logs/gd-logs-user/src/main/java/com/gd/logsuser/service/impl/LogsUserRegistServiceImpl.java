package com.gd.logsuser.service.impl;

import com.gd.logs.entity.LogsUserRegist;
import com.gd.logsuser.mapper.LogsUserRegistMapper;
import com.gd.logsuser.service.LogsUserRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@Service
public class LogsUserRegistServiceImpl implements LogsUserRegistService {

    @Autowired
    private LogsUserRegistMapper logsUserRegistMapper;

    @Override
    public List<LogsUserRegist> findAll() {
        return logsUserRegistMapper.selectList(null);
    }
}
