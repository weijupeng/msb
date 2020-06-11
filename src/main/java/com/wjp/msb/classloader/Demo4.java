package com.wjp.msb.classloader;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author wjp
 * @date 2020/6/4 16:58
 */
public class Demo4 {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        //添加数据
        map.put("刘德华", 50);
        map.put("张学友", 45);
        map.put("黎明", 48);
        map.put("郭富城", 50);
        map.put("刘德华", 50);
        //获得key值
        Set<String> keys = map.keySet();
        //迭代集合
        for (String key : keys) {
            //根据key获得value
            Integer value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
