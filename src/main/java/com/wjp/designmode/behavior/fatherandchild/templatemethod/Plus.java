package com.wjp.designmode.behavior.fatherandchild.templatemethod;

/**
 * @author weijupeng
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}