package com.wjp.test.thread.productandcustomer;

/**
 * @author wjp
 * @date 2020/6/5 16:05
 */
public class ConsumeTask implements Runnable {
    private PhoneFactory pf;

    public ConsumeTask(PhoneFactory pf) {
        this.pf = pf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pf.get();
        }
    }
}
