package com.wjp.designmode.behavior.innerclass.visitor;

/**
 * @author wjp
 * @date 2020/6/10 17:56
 */
public class Test {
    public static void main(String[] args) {
        MyVisitor visitor = new MyVisitor();
        MySubject subject = new MySubject();
        subject.accept(visitor);
    }
}
