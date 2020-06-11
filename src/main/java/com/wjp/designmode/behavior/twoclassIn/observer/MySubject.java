package com.wjp.designmode.behavior.twoclassIn.observer;

/**
 * @author wjp
 * @date 2020/6/10 14:33
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }
}
