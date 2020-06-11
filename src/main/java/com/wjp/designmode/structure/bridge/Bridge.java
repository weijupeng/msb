package com.wjp.designmode.structure.bridge;

/**
 * @author wjp
 * @date 2020/6/9 18:17
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
