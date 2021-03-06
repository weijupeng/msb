package com.wjp.msb.classLoad;

public class CodeBlockForJava extends BaseCodeBlock {
    {
        System.out.println("这里是子类的普通代码块");
    }

    public CodeBlockForJava() {
        System.out.println("这里是子类的构造方法");
    }

    @Override
    public void msg() {
        System.out.println("这里是子类的普通方法");
    }

    public static void msg2() {
        System.out.println("这里是子类的静态方法");
    }

    static {
        System.out.println("这里是子类的静态代码块");
    }

    public static void main(String[] args) {
        BaseCodeBlock bcb = new CodeBlockForJava();
        bcb.msg();
    }

    Other o = new Other();
}