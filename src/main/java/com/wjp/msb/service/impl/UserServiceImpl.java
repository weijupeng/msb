package com.wjp.msb.service.impl;

import com.wjp.msb.entity.User;
import com.wjp.msb.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wjp
 * @date 2020/4/9 16:21
 */
@Service
public class UserServiceImpl implements UserService {

    private static String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

    @Override
    public String addUser(User user) {
        return "success";
    }
}
