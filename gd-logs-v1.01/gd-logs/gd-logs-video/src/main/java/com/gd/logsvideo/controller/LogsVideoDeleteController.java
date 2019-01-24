package com.gd.logsvideo.controller;

import com.gd.logs.entity.LogsVideoDelete;
import com.gd.logsvideo.service.LogsVideoDeleteService;
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
@RequestMapping("/logsVideoDelete")
public class LogsVideoDeleteController {

    @Autowired
    private LogsVideoDeleteService logsVideoDeleteService;

    public List<LogsVideoDelete> findAll() {
        return logsVideoDeleteService.findAll();
    }
}
