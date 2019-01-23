package com.gd.logsuser.service.impl;

import com.gd.logs.entity.User;
import com.gd.logsuser.mapper.UserMapper;
import com.gd.logsuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public List<User> findAll(User user) {
        return userMapper.selectList(null);
    }


}
