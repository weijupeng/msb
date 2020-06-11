package com.wjp.test.thread.threadpool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wjp
 * @date 2020/6/8 11:15
 */
public class SellTicketTask implements Runnable {

    private static int tickets = 100;
    //创建锁对象
    private Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "出票：" + tickets);
                tickets--;
            }
            l.unlock();
        }
    }
}
