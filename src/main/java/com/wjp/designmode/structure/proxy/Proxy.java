package com.wjp.designmode.structure.proxy;

/**
 * @author wjp
 * @date 2020/6/9 17:48
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        super();
        this.source=new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }

}
