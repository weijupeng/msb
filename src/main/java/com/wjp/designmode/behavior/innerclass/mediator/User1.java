package com.wjp.designmode.behavior.innerclass.mediator;

/**
 * @author wjp
 * @date 2020/6/10 18:04
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("User1 exe!");
    }
}
