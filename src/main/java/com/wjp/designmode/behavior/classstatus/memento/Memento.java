package com.wjp.designmode.behavior.classstatus.memento;

/**
 * @author wjp
 * @date 2020/6/10 15:19
 */
public class Memento {
    private String value;


    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
