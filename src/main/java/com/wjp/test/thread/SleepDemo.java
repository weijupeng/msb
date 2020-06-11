package com.wjp.test.thread;

import java.util.Date;

/**
 * @author wjp
 * @date 2020/6/5 15:04
 */
public class SleepDemo {
    public static void main(String[] args) {
        SleepTask task = new SleepTask();
        Thread thread = new Thread(task, "图图");
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i + new Date());
        }
    }
}
