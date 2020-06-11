package com.wjp.test.proxy;

/**
 * @author weijupeng
 */
public class ProxyDemo1 {
    public static void main(String[] args) {
        //直接访问经纪人
        SuoGe sg = new SuoGe();
        sg.sing(200000);
        System.out.println("-----------------------------------");
        sg.liveShow(1000);
        System.out.println("-----------------------------------");
        sg.sleep();
    }
}
