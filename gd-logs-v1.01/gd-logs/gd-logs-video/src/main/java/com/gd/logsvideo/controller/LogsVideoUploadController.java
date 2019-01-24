package com.gd.logsvideo.controller;


import com.gd.logs.entity.LogsVideoUpload;
import com.gd.logsvideo.service.LogsVideoUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@RestController
@RequestMapping("/logsVideoUpload")
public class LogsVideoUploadController {

    @Autowired
    private LogsVideoUploadService logsVideoUploadService;

    public List<LogsVideoUpload> findAll() {
        return logsVideoUploadService.findAll();
    }
}
