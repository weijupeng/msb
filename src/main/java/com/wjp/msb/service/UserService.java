package com.wjp.msb.service;

import com.wjp.msb.entity.User;

/**
 * @author wjp
 * @date 2020/4/9 16:21
 */
public interface UserService {
    /**
     * 新增用户
     * @param user 用户
     * @return String
     */
    String addUser(User user);
}
