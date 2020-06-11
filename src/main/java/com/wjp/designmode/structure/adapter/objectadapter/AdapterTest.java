package com.wjp.designmode.structure.adapter.objectadapter;

import com.wjp.designmode.structure.adapter.classadapter.Source;
import com.wjp.designmode.structure.adapter.classadapter.Targetable;

/**
 * @author wjp
 * @date 2020/6/9 15:22
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Wrapper(new Source());
        targetable.method1();
        targetable.method2();
    }
}
