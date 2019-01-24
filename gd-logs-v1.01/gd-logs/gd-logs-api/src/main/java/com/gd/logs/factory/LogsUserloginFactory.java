package com.gd.logs.factory;

import com.gd.logs.service.LogsUserLoginService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class LogsUserloginFactory implements FallbackFactory<LogsUserLoginService> {
    @Override
    public LogsUserLoginService create(Throwable throwable) {
        return null;
    }
}
