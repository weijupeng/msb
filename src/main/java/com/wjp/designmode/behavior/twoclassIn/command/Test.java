package com.wjp.designmode.behavior.twoclassIn.command;

/**
 * @author wjp
 * @date 2020/6/10 15:10
 */
public class Test {
    public static void main(String[] args) {
        //执行者
        Receiver receiver = new Receiver();
        //命令
        MyCommand myCommand = new MyCommand(receiver);
        //调用者
        Invoker invoker = new Invoker(myCommand);
        invoker.action();
    }
}
