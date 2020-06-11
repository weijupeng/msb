package com.wjp.designmode.behavior.classstatus.memento;

/**
 * @author wjp
 * @date 2020/6/10 15:20
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
