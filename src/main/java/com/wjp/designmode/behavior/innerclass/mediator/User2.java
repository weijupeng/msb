package com.wjp.designmode.behavior.innerclass.mediator;

/**
 * @author wjp
 * @date 2020/6/10 18:05
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user2 exe");
    }
}
