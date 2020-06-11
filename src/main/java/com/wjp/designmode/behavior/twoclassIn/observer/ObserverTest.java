package com.wjp.designmode.behavior.twoclassIn.observer;

/**
 * @author wjp
 * @date 2020/6/10 14:33
 */
public class ObserverTest {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        mySubject.add(new Observer1());
        mySubject.add(new Observer2());
        mySubject.operation();
    }
}
