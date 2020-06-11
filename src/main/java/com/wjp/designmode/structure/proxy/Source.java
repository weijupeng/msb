package com.wjp.designmode.structure.proxy;

/**
 * @author wjp
 * @date 2020/6/9 17:47
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
