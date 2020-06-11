package com.wjp.test.proxy;

/**
 * @author wjp
 * @date 2020/6/9 11:08
 */
public class SuoGe implements Star {

    private LiuYan ly = new LiuYan();

    @Override
    public void sing(double money) {
        if (money < 100000) {
            System.out.println("滚，穷屌丝，一边玩泥巴去");
            return;
        }
        System.out.println("我抽取了" + money * 0.2 + "元代理费用");
        ly.sing(money * 0.8);

    }

    @Override
    public void liveShow(double money) {
        // 对money变量进行判断，修改访问参数
        if (money < 500000) {
            System.out.println("滚，穷屌丝，一边玩泥巴去");
            return;
        }
        System.out.println("我抽取了" + money * 0.2 + "元代理费用");
        ly.liveShow(money * 0.8);

    }

    @Override
    public void sleep() {
        ly.sleep();
    }
}
