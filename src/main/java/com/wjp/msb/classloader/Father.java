package com.wjp.msb.classloader;

/**
 * @author wjp
 * @date 2020/6/4 14:59
 */
public class Father {
    static {
        System.out.println("父类的静态代码");
    }

    public Father() {
        System.out.println("父类的构造方法");
    }
}
