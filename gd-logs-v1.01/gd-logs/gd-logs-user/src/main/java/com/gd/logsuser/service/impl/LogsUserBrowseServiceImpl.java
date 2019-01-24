package com.gd.logsuser.service.impl;

import com.gd.logs.entity.LogsUserBrowse;
import com.gd.logsuser.mapper.LogsUserBrowseMapper;
import com.gd.logsuser.service.LogsUserBrowseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class LogsUserBrowseServiceImpl implements LogsUserBrowseService {

    @Resource
    private LogsUserBrowseMapper logsUserBrowseMapper;

    @Override
    public List<LogsUserBrowse> findAll() {
        return logsUserBrowseMapper.selectList(null);
    }
}
