package com.wjp.designmode.behavior.innerclass.interpreter;

/**
 * @author wjp
 * @date 2020/6/10 18:13
 */
public class Test {
    public static void main(String[] args) {
        int i = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
        System.out.println("i = " + i);
    }
}
