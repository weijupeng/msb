package com.wjp.designmode.behavior.twoclassIn.observer;

/**
 * @author wjp
 * @date 2020/6/10 14:28
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
