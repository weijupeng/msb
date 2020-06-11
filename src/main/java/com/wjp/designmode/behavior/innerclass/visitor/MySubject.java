package com.wjp.designmode.behavior.innerclass.visitor;

/**
 * @author wjp
 * @date 2020/6/10 17:55
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
