package com.wjp.test.thread.threaddemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wjp
 * @date 2020/6/5 15:08
 */
public class SellTicketTask implements Runnable {
    private Integer tickets = 100;
//    private Object obj = new Object();

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (tickets >= 0) {
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
