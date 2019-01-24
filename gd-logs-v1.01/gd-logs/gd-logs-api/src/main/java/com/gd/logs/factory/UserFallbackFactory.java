package com.gd.logs.factory;

import com.gd.logs.entity.User;
import com.gd.logs.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component        //必须添加该数据
public class UserFallbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> findAll() {
                return null;
            }
        };
    }
}
