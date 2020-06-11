package com.wjp.msb.classloader;

/**
 * @author wjp
 * @date 2020/6/4 15:00
 */
public class Child extends Father{
    static {
        System.out.println("子类的静态代码块");
    }

    public Child() {
        System.out.println("子类的构造方法");
    }
}
