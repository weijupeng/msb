package com.wjp.designmode.create.singleton;

/**
 * @author wjp
 * @date 2020/6/9 14:41
 */
public class SingletonTest {
    private static SingletonTest instance = null;

    private SingletonTest() {
    }

    private static synchronized void instanceInit() {
        instance = new SingletonTest();
    }

    private static SingletonTest getInstance() {
        if (instance == null) {
            instanceInit();
        }
        return instance;
    }

}
