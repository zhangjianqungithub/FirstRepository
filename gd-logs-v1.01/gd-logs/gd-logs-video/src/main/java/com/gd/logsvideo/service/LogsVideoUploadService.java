package com.gd.logsvideo.service;

import com.gd.logs.entity.LogsVideoUpload;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
public interface LogsVideoUploadService {

    List<LogsVideoUpload> findAll();
}
