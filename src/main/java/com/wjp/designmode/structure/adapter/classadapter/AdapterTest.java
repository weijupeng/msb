package com.wjp.designmode.structure.adapter.classadapter;

/**
 * @author wjp
 * @date 2020/6/9 15:17
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
