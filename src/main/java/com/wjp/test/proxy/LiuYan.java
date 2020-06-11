package com.wjp.test.proxy;

/**
 * @author wjp
 * @date 2020/6/9 11:06
 */
public class LiuYan implements Star {
    @Override
    public void sing(double money) {
        System.out.println("唱了一首：甜蜜蜜");
        System.out.println("赚了" + money + "元");
    }

    @Override
    public void liveShow(double money) {
        System.out.println("参加了：奔跑吧，兄弟");
        System.out.println("赚了" + money + "元");
    }

    @Override
    public void sleep() {
        System.out.println("好累啊，休息一会。。。。。");
    }
}
