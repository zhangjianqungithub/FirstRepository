package com.gd.logsuser.service.impl;

import com.gd.logs.entity.LogsUserLogout;
import com.gd.logsuser.mapper.LogsUserLogoutMapper;
import com.gd.logsuser.service.LogsUserLogoutService;
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
public class LogsUserLogoutServiceImpl implements LogsUserLogoutService {

    @Autowired
    private LogsUserLogoutMapper logsUserLogoutMapper;

    @Override
    public List<LogsUserLogout> findAll() {
        return logsUserLogoutMapper.selectList(null);
    }
}
