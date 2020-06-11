package com.wjp.test.thread.productandcustomer;

/**
 * @author wjp
 * @date 2020/6/5 16:04
 */
public class ProduceTask implements Runnable {

    private PhoneFactory pf;

    public ProduceTask(PhoneFactory pf) {
        this.pf = pf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pf.produce();
        }
    }
}
