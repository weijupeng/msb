package com.wjp.designmode.behavior.classstatus.stauts;

/**
 * @author wjp
 * @date 2020/6/10 16:37
 */
public class Test {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();
    }
}
