package com.gd.logs.service;

import com.gd.logs.entity.LogsUserBrowse;
import com.gd.logs.factory.LogsUserBrowseFactory;
import org.springframework.cloud.openfeign.FeignClient;
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
@FeignClient(value="provider-logs-user-8010", fallbackFactory=LogsUserBrowseFactory.class)
public interface LogsUserBrowseService {

    @RequestMapping("/logsUserBrowse/findAll")
    List<LogsUserBrowse> findAll();
}
