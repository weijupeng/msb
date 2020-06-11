//package com.wjp.msb.service.impl;
//
//import com.wjp.msb.common.Result;
//import com.wjp.msb.dao.UserDao;
//import com.wjp.msb.entity.User;
//import com.wjp.msb.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
////import com.wjp.msb.dao.EnumCodeDao;
//
///**
// * @author wjp
// * @date 2020/4/9 16:21
// */
//@Service
//public class UserServiceImpl implements UserService {
//    @Autowired
//    @Qualifier("userDao")
//    private UserDao userDao;
////    @Resource
////    private EnumCodeDao enumCodeDao;
//
//    private static String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
//
//    @Override
//    public String addUser(User user) {
//        return "success";
//    }
//
//    @Override
//    public Result getUser5() {
//        Object dao = userDao.getById(1L);
//        return Result.successResult(dao);
//    }
//
//    @Override
//    public Result getCode() {
//        Object byId = userDao.getById(1);
//        return Result.successResult(byId);
//    }
//}
