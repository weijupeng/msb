package com.wjp.designmode.behavior.fatherandchild.strategy;

/**
 * @author wjp
 * @date 2020/6/10 14:16
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] split = split(exp, "\\+");
        return split[0] + split[1];
    }
}
