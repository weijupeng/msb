package com.wjp.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wjp
 * @date 2020/6/9 11:17
 */
public class ProxyDemo2 {
    public static void main(String[] args) {
        LiuYan ly = new LiuYan();
        ClassLoader classLoader = ly.getClass().getClassLoader();
        Class<?>[] interfaces = ly.getClass().getInterfaces();
        InvocationHandler h = (proxy, method, args1) -> {
            String name = method.getName();
            if ("sing".equals(name)) {
                double money = (double) args1[0];
                if (money < 100000) {
                    System.out.println("滚，穷屌丝，一边玩泥巴去");
                    return null;
                }
                System.out.println("我抽取了" + money * 0.2 + "元代理费用");
                //执行LiuYan类中的函数
                return method.invoke(ly, money * 0.8);
            }
            if ("liveShow".equals(name)) {
                //liveShow函数参数只有一个获取第一个
                double money = (double) args1[0];
                // 对money变量进行判断，修改访问参数
                if (money < 500000) {
                    System.out.println("滚，穷屌丝，一边玩泥巴去");
                    return null;
                }
                System.out.println("我抽取了" + money * 0.2 + "元代理费用");
                //执行LiuYan类中的函数
                return method.invoke(ly, money * 0.8);
            }
//				System.out.println(args);//null 由于sleep函数没有参数所以args为null
            //执行LiuYan类中的sleep函数
            return method.invoke(ly, args1);
        };
        Star star = (Star) Proxy.newProxyInstance(classLoader, interfaces, h);
        star.liveShow(100);
        star.sing(200);
        star.sleep();
    }
}
