package com.wjp.designmode.behavior.innerclass.visitor;

/**
 * @author wjp
 * @date 2020/6/10 17:54
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: " + sub.getSubject());
    }
}
