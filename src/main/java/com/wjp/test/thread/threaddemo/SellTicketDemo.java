package com.wjp.test.thread.threaddemo;

/**
 * @author wjp
 * @date 2020/6/5 15:09
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicketTask task = new SellTicketTask();
        Thread thread1 = new Thread(task, "售票窗口1");
        Thread thread2 = new Thread(task, "售票窗口2");
        Thread thread3 = new Thread(task, "售票窗口3");
        Thread thread4 = new Thread(task, "售票窗口4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
