//package com.wjp.msb.web;
//
//import com.wjp.msb.common.Result;
//import com.wjp.msb.entity.User;
//import com.wjp.msb.service.UserService;
//import com.wjp.msb.utils.CreditInfo;
//import com.wjp.msb.utils.LoanInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.math.BigDecimal;
import java.util.ArrayList;
//
///**
// * @author weijupeng
// */
//@RestController
//@RequestMapping("user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/addUser")
//    public String addUser(@RequestBody @Valid User user) {
//        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
//        return userService.addUser(user);
//    }
//
//    @GetMapping("/getUser")
//    public User getUser() {
//        User user = new User();
//        user.setId(1L);
//        user.setAccount("12345678");
//        user.setPassword("12345678");
//        user.setEmail("123@qq.com");
//
//        return user;
//    }
//
//    @GetMapping("/getUser2")
//    public Result getUser2() {
//        ArrayList<CreditInfo> list = new ArrayList<>();
//        CreditInfo creditInfo = new CreditInfo();
//        creditInfo.setCreditAmount(BigDecimal.valueOf(3000));
//        creditInfo.setCreditAvailAmount(BigDecimal.valueOf(1000));
//        creditInfo.setCreditStatus("授信通过");
//        creditInfo.setCreditTime("2020-04-06 13:13:35");
//        creditInfo.setCreditUsedAmount(BigDecimal.valueOf(2000));
//        creditInfo.setCustomerId("12345");
//        creditInfo.setDescribe("拒绝原因");
//        creditInfo.setIdNo("512321341244424214");
//        creditInfo.setMobile("15200849999");
//        creditInfo.setUserName("name");
//        list.add(creditInfo);
//        list.add(creditInfo);
//        return Result.successResult(list);
//    }
//
//
//    @GetMapping("/getUser3")
//    public Result getUser3() {
//        ArrayList<LoanInfo> list = new ArrayList<>();
//        LoanInfo info = new LoanInfo();
//        info.setCooperaOrderId("1434");
//        info.setDeducteFlowId("12345");
//        info.setRepayAmount(BigDecimal.valueOf(2000));
//        info.setRepayTime("2020-04-05 18:09:11");
//        info.setRepayStatus(2);
//        info.setVbsBid("12345");
//        info.setVbsRepayDescribe("vbs描述");
//        list.add(info);
//        list.add(info);
//        return Result.successResult(list);
//    }
//
//
//    @GetMapping("/user5")
//    public Result getUser5() {
//        return userService.getUser5();
//    }
//
//
//    @GetMapping("/code")
//    public Result getCode() {
//        return userService.getCode();
//    }
//}