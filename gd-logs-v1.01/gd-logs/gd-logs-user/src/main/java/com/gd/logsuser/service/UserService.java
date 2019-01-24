package com.gd.logsuser.service;

import com.gd.logs.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
public interface UserService {

    List<User> findAll(User user);
}
