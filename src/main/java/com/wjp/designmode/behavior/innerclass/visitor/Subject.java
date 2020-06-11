package com.wjp.designmode.behavior.innerclass.visitor;

/**
 * @author wjp
 * @date 2020/6/10 17:55
 */
public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
