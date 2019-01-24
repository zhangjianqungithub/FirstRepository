package com.gd.logs.service;

import com.gd.logs.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(value="provider-logs-user-8010", fallbackFactory=UserFallbackFactory.class)
public interface UserService {

    @RequestMapping("/logs/user/findAll")
    public List<User> findAll();
}
