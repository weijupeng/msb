package com.wjp.designmode.behavior.innerclass.interpreter;

/**
 * @author weijupeng
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
