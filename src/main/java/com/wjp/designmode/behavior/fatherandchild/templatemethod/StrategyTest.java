package com.wjp.designmode.behavior.fatherandchild.templatemethod;

/**
 * @author weijupeng
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
