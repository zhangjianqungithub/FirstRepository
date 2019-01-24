package com.gd.logsuser.controller;


import com.gd.logs.entity.LogsUserBrowse;
import com.gd.logsuser.service.LogsUserBrowseService;
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
@RequestMapping("/logsUserBrowse")
public class LogsUserBrowseController {

    @Autowired

    private LogsUserBrowseService logsUserBrowseService;

    @RequestMapping("/findAll")
    public List<LogsUserBrowse> findAll() {

        return logsUserBrowseService.findAll();
    }

}
