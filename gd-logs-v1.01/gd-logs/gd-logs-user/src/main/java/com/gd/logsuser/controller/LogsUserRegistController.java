package com.gd.logsuser.controller;


import com.gd.logs.entity.LogsUserRegist;
import com.gd.logsuser.service.LogsUserRegistService;
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
@RequestMapping("/logsUserRegist")
public class LogsUserRegistController {

    @Autowired
    private LogsUserRegistService logsUserRegistService;

    public List<LogsUserRegist> findAll() {
        return logsUserRegistService.findAll();
    }
}
