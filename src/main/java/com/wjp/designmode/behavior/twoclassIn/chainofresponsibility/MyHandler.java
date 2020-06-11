package com.wjp.designmode.behavior.twoclassIn.chainofresponsibility;

/**
 * @author wjp
 * @date 2020/6/10 15:02
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
