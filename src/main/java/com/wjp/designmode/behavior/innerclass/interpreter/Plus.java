package com.wjp.designmode.behavior.innerclass.interpreter;

/**
 * @author wjp
 * @date 2020/6/10 18:12
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
