package com.gd.logsvideo.service.impl;

import com.gd.logs.entity.LogsVideoDelete;
import com.gd.logsvideo.mapper.LogsVideoDeleteMapper;
import com.gd.logsvideo.service.LogsVideoDeleteService;
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
public class LogsVideoDeleteServiceImpl implements LogsVideoDeleteService {

    @Autowired
    private LogsVideoDeleteMapper logsVideoDeleteMapper;

    @Override
    public List<LogsVideoDelete> findAll() {
        return logsVideoDeleteMapper.selectList(null);
    }
}
