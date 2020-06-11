package com.wjp.designmode.structure.bridge;

/**
 * @author wjp
 * @date 2020/6/9 18:17
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
