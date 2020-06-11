package com.wjp.test.thread.productandcustomer;

/**
 * @author wjp
 * @date 2020/6/5 16:01
 */
public class PhoneFactory {
    private String name;
    private Integer price;

    private boolean hasPhone = false;

    private int i = 0;

    public synchronized void produce() {
        if (hasPhone) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (i % 2 == 0) {
            this.name = "IPhone Xs";
            this.price = 8000;
            System.out.println("生产了:" + name + "....." + price);
        } else {
            this.name = "huawei";
            this.price = 10000;
            System.out.println("生产了:" + name + "....." + price);
        }
        i++;
        this.hasPhone = true;
        this.notify();
    }

    public synchronized void get() {
        if (hasPhone) {
            //消费手机
            System.out.println("消费了:" + name + "....." + price);
            this.hasPhone = false;
            this.notify();
        } else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
