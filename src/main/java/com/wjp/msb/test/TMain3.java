package com.wjp.msb.test;

/**
 * @author wjp
 * @date 2020/5/19 17:19
 */
public class TMain3 extends TMain2 {
    public static void main(String[] args) {
        TMain3 main3 = new TMain3();
        main3.est2();
        main3.est("!2");
    }

    @Override
    public void est(String s) {
        System.out.println(s);
    }

}
