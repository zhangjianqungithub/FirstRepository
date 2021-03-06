package com.gd.logs.service;

import com.gd.logs.entity.LogsUserLogout;
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
//@FeignClient(value="provider-logs-user-8010")
public interface LogsUserLogoutService {

    @RequestMapping("/logsUserLogout/findAll")
    List<LogsUserLogout> findAll();
}
