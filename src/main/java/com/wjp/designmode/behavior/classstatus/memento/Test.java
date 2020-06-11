package com.wjp.designmode.behavior.classstatus.memento;

/**
 * @author wjp
 * @date 2020/6/10 15:21
 */
public class Test {
    public static void main(String[] args) {
        Original start = new Original("start");
        Storage storage = new Storage(start.createMemento());

        start.setValue("end");
        System.out.println(start.getValue());
        start.restoreMemento(storage.getMemento());
        System.out.println(start.getValue());
    }
}
