package com.wjp.msb.test;

import java.util.concurrent.TimeUnit;

/**
 * @author wjp
 * @date 2020/5/11 10:29
 */
public class T01_HelloVolatile {
    boolean running = true;

    void m() {
        System.out.println("m start");
        while (running) {
            System.out.println("m end");
        }
    }

    public static void main(String[] args) {
        T01_HelloVolatile t = new T01_HelloVolatile();
        new Thread(t::m, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }
}
