package com.wjp.msb.utils;

public class Test {


    /**
     * @param args add by zxx ,Dec 9, 2008
     */

    public static void main(String[] args) {

        // TODO Auto-generated method stub

   Test.test()
        ;

    }

    static void test() {

        int x = 1;

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            ++x;

        }

    }

}
