package com.wjp.msb.web;

import org.springframework.beans.BeanUtils;

/**
 * @author wjp
 * @date 2020/5/25 16:56
 */
public class User2Demo {
    public static void main(String[] args) {
        User3 user3 = new User3();
        User user = new User();
        user.setAge(1);
        user.setName("user");
        User2 user2 = new User2();
        user2.setDesc("user2");
        user2.setSize(2);
        BeanUtils.copyProperties(user, user3);
        BeanUtils.copyProperties(user2, user3);
        System.out.println(user3);
    }
}
