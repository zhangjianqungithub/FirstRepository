package com.gd.logs.service;

import com.gd.logs.entity.LogsUserLogin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
//@FeignClient(value="provider-logs-user-8010", fallbackFactory=LogsUserloginFactory.class)
public interface LogsUserLoginService {

    @RequestMapping("/logsUserLogin/findAll")
    List<LogsUserLogin> findAll();
}
