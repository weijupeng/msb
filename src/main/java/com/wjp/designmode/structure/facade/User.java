package com.wjp.designmode.structure.facade;

/**
 * @author wjp
 * @date 2020/6/9 18:13
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
