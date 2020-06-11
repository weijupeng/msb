package com.wjp.designmode.structure.adapter.objectadapter;

import com.wjp.designmode.structure.adapter.classadapter.Source;
import com.wjp.designmode.structure.adapter.classadapter.Targetable;

/**
 * @author wjp
 * @date 2020/6/9 15:21
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }


}
