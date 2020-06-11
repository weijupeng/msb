package com.wjp.designmode.behavior.twoclassIn.observer;

/**
 * @author wjp
 * @date 2020/6/10 14:29
 */
public interface Subject {
    void add(Observer observer);

    void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 自身的操作
     */
    void operation();
}
