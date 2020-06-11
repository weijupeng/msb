package com.wjp.designmode.behavior.classstatus.stauts;

/**
 * @author wjp
 * @date 2020/6/10 16:34
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("execute the first opt");
    }

    public void method2() {
        System.out.println("execute the second opt");
    }
}
