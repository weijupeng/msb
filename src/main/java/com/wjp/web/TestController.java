package com.wjp.web;

import com.wjp.msb.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjp
 * @date 2020/6/10 11:38
 */
@RestController
public class TestController {
    @GetMapping("test1")
    public Result test1() {
        String id = "12355";
        return Result.successResult(id);
    }


    @GetMapping("test2")
    public Result test2() {
        String id = "12355";
        Persons persons = new Persons();
        persons.setId(id);
        return Result.successResult(persons);
    }
}
