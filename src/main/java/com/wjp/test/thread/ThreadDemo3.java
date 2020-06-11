package com.wjp.test.thread;

/**
 * @author wjp
 * @date 2020/6/5 14:53
 */
public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread1 = new Thread(myTask, "thread1");
        Thread thread2 = new Thread(myTask, "thread2");
        thread1.start();
        thread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "====" + i);
            Thread.sleep(10);
        }
    }
}
