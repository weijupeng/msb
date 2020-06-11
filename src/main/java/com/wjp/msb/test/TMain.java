package com.wjp.msb.test;

/**
 * @author wjp
 * @date 2020/5/19 17:08
 */
public class TMain {
    int j = 1;

    public synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);
    }

    class T1 implements Runnable {
        @Override
        public void run() {
            inc();
        }
    }

    public synchronized void des() {
        j--;
        System.out.println(Thread.currentThread().getName() + "-des:" + j);
    }

    class T11 implements Runnable {
        @Override
        public void run() {
            des();
        }
    }

    public static void main(String[] args) {
        TMain t = new TMain();
        T1 t1 = t.new T1();
        T11 t11 = t.new T11();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(t1);
            thread.start();

            Thread thread1 = new Thread(t11);
            thread1.start();
        }
    }
}
