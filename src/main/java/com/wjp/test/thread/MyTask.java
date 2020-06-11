package com.wjp.test.thread;

/**
 * @author wjp
 * @date 2020/6/5 14:33
 */
public class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }
}
