package com.gd.logsuser.controller;


import com.gd.logs.entity.LogsUserLogin;
import com.gd.logsuser.service.LogsUserLoginService;
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
@RequestMapping("/logsUserLogin")
public class LogsUserLoginController {

    @Autowired
    private LogsUserLoginService logsUserLoginService;

    public List<LogsUserLogin> findAll() {
        return logsUserLoginService.findAll();
    }

}
