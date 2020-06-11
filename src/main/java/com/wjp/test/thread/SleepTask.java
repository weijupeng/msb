package com.wjp.test.thread;

import java.util.Date;

/**
 * @author wjp
 * @date 2020/6/5 15:03
 */
public class SleepTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i + new Date());
            //让线程睡一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
