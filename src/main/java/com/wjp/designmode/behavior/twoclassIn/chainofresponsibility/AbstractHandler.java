package com.wjp.designmode.behavior.twoclassIn.chainofresponsibility;

/**
 * @author wjp
 * @date 2020/6/10 15:01
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }


}
