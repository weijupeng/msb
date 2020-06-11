package com.wjp.test.thread.productandcustomer;

/**
 * @author wjp
 * @date 2020/6/5 16:53
 */
public class ProduceTest {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        // 创建生产手机任务对象
        ProduceTask pt = new ProduceTask(factory);
        // 创建消费手机任务对象
        ConsumeTask ct = new ConsumeTask(factory);
        //创建线程对象，接收生产任务对象
        Thread t1 = new Thread(pt);
        //创建线程对象，接收消费任务对象
        Thread t2 = new Thread(ct);
        //启动线程
        t1.start();
        t2.start();
    }
}
