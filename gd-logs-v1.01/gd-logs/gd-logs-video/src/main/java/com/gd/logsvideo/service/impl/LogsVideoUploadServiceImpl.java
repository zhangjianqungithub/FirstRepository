package com.gd.logsvideo.service.impl;

import com.gd.logs.entity.LogsVideoUpload;
import com.gd.logsvideo.mapper.LogsVideoUploadMapper;
import com.gd.logsvideo.service.LogsVideoUploadService;
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
public class LogsVideoUploadServiceImpl implements LogsVideoUploadService {

    @Autowired
    private LogsVideoUploadMapper logsVideoUploadMapper;

    @Override
    public List<LogsVideoUpload> findAll() {
        return logsVideoUploadMapper.selectList(null);
    }
}
