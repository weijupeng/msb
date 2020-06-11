package com.wjp.msb.test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wjp
 * @date 2020/5/15 14:45
 */
public class ClsssDemos {
    public Integer eat(Integer c) {
        String s = "1234";

        System.out.println(s.intern());
        return 1;
    }

    public void eat() {
        String s = "1234";

        System.out.println(s.intern());
    }

    public static void main(String[] args) {
        ClsssDemos demos = new ClsssDemos();
        new ArrayList<>();
        demos.eat();
    }
}
