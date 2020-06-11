package com.wjp.designmode.create.singleton;

/**
 * @author wjp
 * @date 2020/6/9 14:32
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingleFactory {
        private static Singleton instance = new Singleton();
    }


    public static synchronized Singleton getInstance() {
        return SingleFactory.instance;
    }


    public Object readResolve() {
        return getInstance();
    }
}
