package com.wjp.designmode.behavior.twoclassIn.command;

/**
 * @author wjp
 * @date 2020/6/10 15:08
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
