package com.wjp.designmode.structure.adapter.classadapter;

/**
 * @author wjp
 * @date 2020/6/9 15:16
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is a targetable method");
    }
}
