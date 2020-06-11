package com.wjp.designmode.structure.decorator;

/**
 * @author wjp
 * @date 2020/6/9 17:44
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
