package com.wjp.test.thread;

/**
 * @author wjp
 * @date 2020/6/5 15:00
 */
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        };
        Thread thread = new Thread(runnable, "runnable1");
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
            Thread.sleep(1);
        }
    }
}
