package com.gd.logsuser.controller;

import com.gd.logs.entity.LogsUserLogout;
import com.gd.logsuser.service.LogsUserLogoutService;
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
@RequestMapping("/logsUserLogout")
public class LogsUserLogoutController {

    @Autowired
    private LogsUserLogoutService logsUserLogoutService;

    public List<LogsUserLogout> findAll() {
        return logsUserLogoutService.findAll();
    }
}
