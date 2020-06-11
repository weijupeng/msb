package com.wjp.designmode.behavior.innerclass.mediator;

/**
 * @author wjp
 * @date 2020/6/10 18:03
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void work();
}
