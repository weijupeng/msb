package com.wjp.designmode.behavior.innerclass.mediator;

/**
 * @author wjp
 * @date 2020/6/10 18:06
 */
public class Test {
    public static void main(String[] args) {
        MyMediator myMediator = new MyMediator();
        myMediator.createMediator();
        myMediator.workAll();
    }
}
