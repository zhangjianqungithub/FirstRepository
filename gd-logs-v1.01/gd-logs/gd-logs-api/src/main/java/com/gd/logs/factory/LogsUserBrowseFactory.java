package com.gd.logs.factory;

import com.gd.logs.service.LogsUserBrowseService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class LogsUserBrowseFactory implements FallbackFactory<LogsUserBrowseService> {
    @Override
    public LogsUserBrowseService create(Throwable throwable) {
        return null;
    }
}
