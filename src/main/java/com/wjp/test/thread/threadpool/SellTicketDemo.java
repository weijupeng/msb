package com.wjp.test.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wjp
 * @date 2020/6/8 11:17
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicketTask task = new SellTicketTask();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(task);
        executorService.execute(task);
    }
}
