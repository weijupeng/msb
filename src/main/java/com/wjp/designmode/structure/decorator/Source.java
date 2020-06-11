package com.wjp.designmode.structure.decorator;

/**
 * @author wjp
 * @date 2020/6/9 15:59
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
