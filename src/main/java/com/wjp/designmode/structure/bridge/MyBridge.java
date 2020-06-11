package com.wjp.designmode.structure.bridge;

/**
 * @author wjp
 * @date 2020/6/9 18:19
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
